package io.javaguru.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "Welcome to Spring Boot REST API";
	}
}
