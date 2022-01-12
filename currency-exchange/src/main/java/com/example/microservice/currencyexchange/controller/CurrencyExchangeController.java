package com.example.microservice.currencyexchange.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.currencyexchange.dto.CurrencyExBean;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	Environment env;

	private Logger log = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@GetMapping("/getExchange/from/{from}/to/{to}")
	public CurrencyExBean getExchange(@PathVariable String from,@PathVariable String to)
	{
		log.info("request from cc",from,to);
		String port = env.getProperty("local.server.port");
		return new CurrencyExBean(from,to,65,port);
	}
	
}
