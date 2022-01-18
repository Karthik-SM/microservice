package com.example.microservice.currencyexchangemysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CurrencyExchangeMysqlApplication implements CommandLineRunner {

	@Autowired
	ExchangeValueRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeMysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		long count = repository.count();
		if (count == 0) {
			repository.save(new CurrencyExBean(10001L, "USD", "INR", 60));
			repository.save(new CurrencyExBean(10002L, "EUR", "INR", 70));
			repository.save(new CurrencyExBean(10003L, "AUD", "INR", 20));
		}
	}
}
