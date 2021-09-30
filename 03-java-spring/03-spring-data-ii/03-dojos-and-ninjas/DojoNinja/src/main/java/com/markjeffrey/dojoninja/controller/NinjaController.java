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
import org.springframework.web.bind.annotation.RequestMapping;

import com.markjeffrey.dojoninja.models.Ninja;
import com.markjeffrey.dojoninja.services.DojoService;
import com.markjeffrey.dojoninja.services.NinjaService;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
	@Autowired
	private NinjaService nService;
	@Autowired
	private DojoService dService;
	
	@GetMapping("/new")
	public String create(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojos", this.dService.getAllDojos());
		return "/ninja.jsp";
	}
	
	@PostMapping("/newNinja")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model viewModel) {
		Long idDojo = ninja.getDojoToNinja().getId();
		if(result.hasErrors()) {
			viewModel.addAttribute("dojos", this.dService.getAllDojos());
			return "/ninja.jsp";
		}
		this.nService.create(ninja);
		return "redirect:/details/" + idDojo;
	}
	
	@GetMapping("/{id}/edit")
	public String editNin(@PathVariable("id") Long id, @ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("oneNinja", this.nService.getOneNinja(id));
		viewModel.addAttribute("dojos", this.dService.getAllDojos());
		return "ninjaEdit.jsp";
	}
	
	@PutMapping("/{id}/edit")
	public String edit(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("oneNinja", this.nService.getOneNinja(id));
			return "ninjaEdit.jsp";
		}
		this.nService.editNinja(ninja);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteNin(@PathVariable("id") Long id) {
		Ninja ninja = this.nService.getOneNinja(id);
		Long idDoj = ninja.getDojoToNinja().getId();
		this.nService.deleteNinja(id);
		return "redirect:/details/" + idDoj;
	}
}
