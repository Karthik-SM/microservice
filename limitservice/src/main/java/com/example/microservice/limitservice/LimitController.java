package com.example.microservice.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.limitservice.dto.LimitConfigBean;

@RestController
public class LimitController {
	
	@Autowired
	LimitConfigBean beanObj;
	
	@GetMapping("/limits")
	public LimitConfigBean getLimits()
	{
		return beanObj;
	}

}
