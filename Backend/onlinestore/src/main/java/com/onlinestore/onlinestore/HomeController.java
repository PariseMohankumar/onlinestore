package com.onlinestore.onlinestore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String greet() {
		return "Hello World";
	}
	@GetMapping("/blog")
	public String hello() {
		return "Thank for your Interest";
	}
}