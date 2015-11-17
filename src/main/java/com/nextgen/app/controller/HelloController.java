package com.nextgen.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nextgen.app.entities.User;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	User user;

	@RequestMapping("{name}")
	public String greetUser(@PathVariable("name") String name) {
		return "Greetings from Spring Boot! " + name.toUpperCase();
	}

	@RequestMapping
	public String greet() {
		return "Greetings from Spring Boot! " + user.getName()
				+ ". This is Bean Config Test using @Configuration for custom bean definitions";
	}

}
