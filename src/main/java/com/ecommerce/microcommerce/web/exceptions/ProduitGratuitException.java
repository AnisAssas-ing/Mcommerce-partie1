package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends Exception {

	public ProduitGratuitException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
}
