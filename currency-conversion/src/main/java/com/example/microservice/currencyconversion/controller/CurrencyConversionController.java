package com.example.microservice.currencyconversion.controller;

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
	
	@GetMapping("/getConversion/from/{from}/to/{to}/{quantity}")
	public CurrencyConversionBean getConversion(@PathVariable String from,
			@PathVariable String to,@PathVariable Integer quantity)
	{
		CurrencyConversionBean conversionDto = proxy.getExchange(from, to);
		Integer total = quantity * conversionDto.getMultipleValue();
		conversionDto.setQunatity(quantity);
		conversionDto.setTotal(total);
		return conversionDto;
	}
	

}
