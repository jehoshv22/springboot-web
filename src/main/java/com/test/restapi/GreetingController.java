package com.test.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
     @GetMapping("greeting")
	public String greeting() {
		return "Hello Greeting from Spring Boot Rest Api";
	}
}
