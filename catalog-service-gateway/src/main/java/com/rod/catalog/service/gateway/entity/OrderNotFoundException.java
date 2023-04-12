package com.rod.catalog.service.gateway.entity;

@SuppressWarnings("serial")
public class OrderNotFoundException extends RuntimeException{

	public OrderNotFoundException(String message) {
		super(message);
	}
	
}
