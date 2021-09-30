package com.markjeffrey.dojoninja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markjeffrey.dojoninja.models.Dojo;
import com.markjeffrey.dojoninja.services.DojoService;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private DojoService dService;
	
	@GetMapping("/")
	public List<Dojo> index(){
		return this.dService.getAllDojos();
	}
	
	@GetMapping("/{id}")
	public Dojo getOne(@PathVariable("id") Long id) {
		return this.dService.getOneDojo(id);
	}
	
	@PostMapping("/create")
	public Dojo create(Dojo dojo) {
		return this.dService.createDojo(dojo);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.dService.deleteDojo(id);
	}
}
