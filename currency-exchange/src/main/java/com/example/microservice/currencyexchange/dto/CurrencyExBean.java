package com.example.microservice.currencyexchange.dto;

import org.springframework.stereotype.Component;

@Component
public class CurrencyExBean {

	private String from;
	private String to;
	private Integer multipleValue;
	private String port;
	
	public CurrencyExBean() {
		super();
	}
	public CurrencyExBean(String from, String to, Integer multipleValue,String port) {
		this.from = from;
		this.to = to;
		this.multipleValue = multipleValue;
		this.port=port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Integer getMultipleValue() {
		return multipleValue;
	}
	public void setMultipleValue(Integer multipleValue) {
		this.multipleValue = multipleValue;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
}
