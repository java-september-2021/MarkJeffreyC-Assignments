package com.markjeffrey.dojooverflow.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.markjeffrey.dojooverflow.models.Answer;
import com.markjeffrey.dojooverflow.models.Question;
import com.markjeffrey.dojooverflow.models.Tag;
import com.markjeffrey.dojooverflow.services.AnswerService;
import com.markjeffrey.dojooverflow.services.QuestionService;
import com.markjeffrey.dojooverflow.services.TagService;

@Controller
public class HomeController {
	@Autowired
	public QuestionService qService;
	@Autowired
	public AnswerService aService;
	@Autowired
	public TagService tService;
	
	@GetMapping("/")
	public String home(Model viewModel) {
		if (this.qService.getAllQuestions() == null) {
			return "question_dashboard.jsp";
		}
		viewModel.addAttribute("allQuestions", this.qService.getAllQuestions());
		return "question_dashboard.jsp";
	}
	
	@GetMapping("/questions/new")
	public String newQuestion() {
		return "new_question.jsp";
	}
	
	@PostMapping("/questions/new")
	public String addQuestion(@RequestParam("question") String question, @RequestParam("tag") String tag, Model viewModel) {
		Question newQuestion = new Question(question);
		this.qService.createQuestion(newQuestion);
		Question findQuestion = this.qService.getOneMyQuestion(question);
		tag = tag.replaceAll("\\s", "");
		String[] strArray = tag.split(",");
		for (String word: strArray) {		
			System.out.println(word);
			if (!this.tService.doesTagExist(word)) {
				Tag newTag = new Tag(word);
				Tag findTag = this.tService.createTag(newTag);
				System.out.println(findTag);
				System.out.println(findQuestion);
				//Tag findTag = this.tService.getOneMyTag(tag);
				this.qService.addQuest(findTag, findQuestion);
			} else {
				Tag findTag = this.tService.getOneMyTag(word);
				System.out.println(findTag);
				this.qService.addQuest(findTag, findQuestion);
			}
		}
		return "redirect:/";
	}
	
	@GetMapping("/questions/{id}")
	public String profileQuestion(@ModelAttribute("answer") Answer answer, @PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("oneQuestion", this.qService.getOneQuestion(id));
		return "question_profile.jsp";
	}
	
	@PostMapping("/questions/{id}")
	public String addAnswerQuestion(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "redirect:/questions/" + id;
		}
		this.aService.createAnswer(answer);
		return "redirect:/";
	}
}
