package com.markjeffrey.dojosurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "home.jsp";
	}

	@PostMapping("/display")
	public String display(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment, Model viewModel) {
		
		viewModel.addAttribute("name", name);
		viewModel.addAttribute("location", location);
		viewModel.addAttribute("language", language);
		viewModel.addAttribute("comment", comment);
		
		return "display.jsp";
	}
	
}
