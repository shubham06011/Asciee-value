package com.customeexceptiondemo;

public class AmountNotSufficientException extends RuntimeException {
	 AmountNotSufficientException(String message) {
		super (message);
		
	}

}
