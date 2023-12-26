package com.example.demo.controller;

import static org.apache.commons.text.StringEscapeUtils.escapeHtml4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hi(@RequestParam final String name) {
		final String xssFiltered = escapeHtml4(name);
		return "Hi " + xssFiltered + "!!";
	}
}