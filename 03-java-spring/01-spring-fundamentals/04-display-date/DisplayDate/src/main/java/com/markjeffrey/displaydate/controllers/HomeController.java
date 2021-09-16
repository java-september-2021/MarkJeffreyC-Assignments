package com.markjeffrey.displaydate.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/date")
	public String displayDate(Model viewDate) {
		LocalDateTime myNewDate = LocalDateTime.now();
		DateTimeFormatter myMonthYear = DateTimeFormatter.ofPattern("MMMM, yyyy");
		DateTimeFormatter myDate = DateTimeFormatter.ofPattern("d");
		DateTimeFormatter myDay = DateTimeFormatter.ofPattern("EEEE");
		
		String days = myNewDate.format(myDay);
		String monthYear = myNewDate.format(myMonthYear);
		String date = myNewDate.format(myDate);
		
		viewDate.addAttribute("day", days);
		viewDate.addAttribute("monthYear", monthYear);
		viewDate.addAttribute("date", date);
		
		return "date.jsp";
	}
	
	@RequestMapping(value="/time")
	public String displayTime(Model viewTime) {
		LocalDateTime myNewTime = LocalDateTime.now();
		DateTimeFormatter myHour = DateTimeFormatter.ofPattern("HH:mm a");

		String myCurrentTime = myNewTime.format(myHour);
		
		viewTime.addAttribute("time", myCurrentTime);

		
		return "time.jsp";
	}
}
