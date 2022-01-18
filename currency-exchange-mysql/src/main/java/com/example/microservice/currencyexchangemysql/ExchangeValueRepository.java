package com.example.microservice.currencyexchangemysql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<CurrencyExBean, Long> {
	CurrencyExBean findByFromAndTo(String from, String to);
}
