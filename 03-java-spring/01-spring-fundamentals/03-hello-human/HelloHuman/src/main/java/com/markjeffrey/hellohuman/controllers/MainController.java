package com.markjeffrey.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/name", method=RequestMethod.POST)
	public String name(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname, Model viewName) {
		viewName.addAttribute("firstname", firstname);
		viewName.addAttribute("lastname", lastname);
		return "name.jsp";
	}
}
