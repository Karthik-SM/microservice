package com.practise.restful.restfulDemo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundExpception extends RuntimeException {

	public CustomerNotFoundExpception(String message) {
		super(message);
	}

	private static final long serialVersionUID = -7254226579360631563L;

}
