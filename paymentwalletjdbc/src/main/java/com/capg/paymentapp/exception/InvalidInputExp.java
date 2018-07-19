package com.capg.paymentapp.exception;

public class InvalidInputExp extends Exception {

	@Override
	public String toString() {
		return "InvalidInputExp [string=" + string + "]";
	}

	private String string;

	public InvalidInputExp(String string) {
		// TODO Auto-generated constructor stub
		this.string=string;
		
	}
	

}
