package com.markjeffrey.dojoninja.controller;

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

import com.markjeffrey.dojoninja.models.Dojo;
import com.markjeffrey.dojoninja.models.Ninja;
import com.markjeffrey.dojoninja.services.DojoService;

@Controller
public class HomeController {
	@Autowired
	public DojoService dService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/dojo/new";
	}
	
	@GetMapping("/dojo/new")
	public String index(@ModelAttribute("dojo") Dojo dojo, Model viewModel) {
		viewModel.addAttribute("allDojos", this.dService.getAllDojos());
		return "dojo.jsp";
	}

	@PostMapping("dojo/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("allDojos", this.dService.getAllDojos());
			return "dojo.jsp";
		}
		this.dService.createDojo(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/details/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("dojoDetails", this.dService.getOneDojo(id));
		return "display.jsp";	
	}
	
	@GetMapping("/{id}/edit")
	public String editDojo(@PathVariable("id") Long id, @ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("oneDojo", this.dService.getOneDojo(id));
		return "dojoEdit.jsp";
	}
	
	@PutMapping("/{id}/edit")
	public String edit(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("oneDojo", this.dService.getOneDojo(id));
			return "dojoEdit.jsp";
		}
		this.dService.editDojo(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.dService.deleteDojo(id);
		return "redirect:/";
	}
}
