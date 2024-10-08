package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class helloController {
	private static final Logger logger = LoggerFactory.getLogger(helloController.class);

	@RequestMapping("/hello")
	public String index() {
		// Add logging statement here
		logger.info("Handling request for /hello");

		return "index";
	}

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		// Add logging statement here
		logger.info("Handling request for /greeting with parameter 'name': {}", name);

		model.addAttribute("name", name);
		return "greeting";
	}

}
