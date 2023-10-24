package com.example.demo.controller;


import org.apache.commons.text.StringEscapeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hi(@RequestParam final String name) {
		String xssFiletered = StringEscapeUtils.escapeHtml4(name);
		return "Hi " + xssFiletered + "!!";
	}
}