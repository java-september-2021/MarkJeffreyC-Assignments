package com.markjeffrey.language.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.markjeffrey.language.models.Language;
import com.markjeffrey.language.services.LanguageService;

@Controller
public class HomeController {
	@Autowired
	public LanguageService lService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/language";
	}
	
	@GetMapping("/language")
	public String index(@ModelAttribute("language") Language language, Model viewModel) {
		viewModel.addAttribute("allLanguages", this.lService.getAllLanguages());
		return "index.jsp";
	}
	
	@PostMapping("/language")
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("allLanguages", this.lService.getAllLanguages());
			return "index.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/";
	}
	
	@GetMapping("/language/{id}")
	public String display(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("oneLanguage", this.lService.getOneLanguage(id));
		return "display.jsp";
	}
	
	@GetMapping("/language/{id}/edit")
	public String editLang(@PathVariable("id") Long id, @ModelAttribute("language") Language language, Model viewModel) {
		viewModel.addAttribute("oneLanguage", this.lService.getOneLanguage(id));
		return "edit.jsp";
	}
	
	@PutMapping("/language/{id}/edit")
	public String edit(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("oneLanguage", this.lService.getOneLanguage(id));
			return "edit.jsp";
		}
		this.lService.editLanguage(language);
		return "redirect:/";
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/";
	}
}
