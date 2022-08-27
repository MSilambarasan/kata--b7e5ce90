package com.kata.tower.exception;

public class InvalidInputException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String errorMessage){
		super(errorMessage);
	}
	
}
