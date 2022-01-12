package com.example.microservice.currencyconversion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.currencyconversion.dto.CurrencyConversionBean;
import com.example.microservice.currencyconversion.proxy.CurrencyExchnageProxy;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	CurrencyExchnageProxy proxy;
	
	private Logger log = LoggerFactory.getLogger(CurrencyConversionController.class);
	
	@GetMapping("/getConversion/from/{from}/to/{to}/{quantity}")
	public CurrencyConversionBean getConversion(@PathVariable String from,
			@PathVariable String to,@PathVariable Integer quantity)
	{
		log.info("request from cc",from,to);
		CurrencyConversionBean conversionDto = proxy.getExchange(from, to);
		Integer total = quantity * conversionDto.getMultipleValue();
		conversionDto.setQunatity(quantity);
		conversionDto.setTotal(total);
		return conversionDto;
	}
	

}
