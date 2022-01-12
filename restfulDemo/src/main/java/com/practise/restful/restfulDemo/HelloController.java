package com.practise.restful.restfulDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String getHelloworld()
	{
		return "Hello World! Welcome Karthik SM !";
	}
}
