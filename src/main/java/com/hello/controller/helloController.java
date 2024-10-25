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

	/**
	 * Handles GET requests to /hello endpoint.
	 *
	 * @return the view name of the index page
	 */
	@RequestMapping("/hello")
	public String index() {
		logger.info("Received request to /hello endpoint");
		try {
			// Simulating some work being done
			Thread.sleep(1000); // Wait for 1 second
		} catch (InterruptedException e) {
			logger.error("Error occurred while processing /hello request", e);
		}
		return "index";
	}

	/**
	 * Handles GET requests to /greeting endpoint.
	 *
	 * @param name the name parameter from the request query string
	 * @param model the Spring MVC model object
	 * @return the view name of the greeting page
	 */
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		logger.info("Received request to /greeting endpoint with name: {}", name);
		try {
			// Add the name attribute to the model
			model.addAttribute("name", name);
		} catch (Exception e) {
			logger.error("Error occurred while adding name attribute to model", e);
		}
		return "greeting";
	}


}