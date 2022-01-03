package com.example.microservice.currencyconversion.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservice.currencyconversion.dto.CurrencyConversionBean;


//@FeignClient(name="currency-exchange",url="http://localhost:8000")
@FeignClient(name="currency-exchange")
public interface CurrencyExchnageProxy {

	@GetMapping("/currency-exchange/getExchange/from/{from}/to/{to}")
	public CurrencyConversionBean getExchange(@PathVariable String from,@PathVariable String to);
	
}
