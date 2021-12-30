package com.practise.restful.restfulDemo;

import java.util.Date;

public class CustomResponseException {

	String message;
	Date timestamp;
	String detail;
	
	public CustomResponseException(String message, Date timestamp, String detail) {
		super();
		this.message = message;
		this.timestamp = timestamp;
		this.detail = detail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
