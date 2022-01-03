package com.example.microservice.currencyconversion.dto;

public class CurrencyConversionBean {

	private String from;
	private String to;
	private Integer multipleValue;
	private String port;
	private Integer qunatity;
	private Integer total;
	
	
	public CurrencyConversionBean() {
		super();
	}
	public CurrencyConversionBean(String from, String to, Integer qunatity,Integer total) {
		super();
		this.from = from;
		this.to = to;
		//this.multipleValue = multipleValue;
		this.qunatity = qunatity;
		this.total = total;
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
	public Integer getQunatity() {
		return qunatity;
	}
	public void setQunatity(Integer qunatity) {
		this.qunatity = qunatity;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
}
