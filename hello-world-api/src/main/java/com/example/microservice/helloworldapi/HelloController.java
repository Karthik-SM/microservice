package com.example.microservice.helloworldapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/helloworld")
	public String getString()
	{
		return "Hello World... Welcome SM Karthik!";
	}
}
