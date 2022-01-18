package com.example.microservice.currencyexchangemysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exchange_value")
public class CurrencyExBean {
	@Id
	private Long id;
	@Column(name = "currency_from")
	private String from;
	@Column(name = "currency_to")
	private String to;
	private Integer multipleValue;
	private String port;
	
	public CurrencyExBean() {
		super();
	}
	public CurrencyExBean(Long id,String from, String to, Integer multipleValue) {
		this.id=id;
		this.from = from;
		this.to = to;
		this.multipleValue = multipleValue;
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
