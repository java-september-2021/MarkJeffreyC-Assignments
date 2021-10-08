package com.markjeffrey.dojooverflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markjeffrey.dojooverflow.models.Question;
import com.markjeffrey.dojooverflow.services.QuestionService;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private QuestionService qService;
	
	@GetMapping("/")
	public List<Question> index(){
		return this.qService.getAllQuestions();
	}
	
	@GetMapping("/{id}")
	public Question getOne(@PathVariable("id") Long id) {
		return this.qService.getOneQuestion(id);
	}
	
	@PostMapping("/create")
	public Question create(Question question) {
		return this.qService.createQuestion(question);
	}
	
	@PostMapping("/delete/{ID}")
	public void delete(@PathVariable("id") Long id) {
		this.qService.deleteQuestion(id);
	}
}
