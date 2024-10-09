package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class helloController {

	@RequestMapping("/hello")
	public String index() {
		return "index";
	}

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

		model.addAttribute("name", name);
		return "greeting";
	}


}