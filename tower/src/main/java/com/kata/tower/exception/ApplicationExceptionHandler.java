package com.kata.tower.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler({InvalidInputException.class})
	public ResponseEntity<ApplicationException> invalidInputExceptionHandler(InvalidInputException e) {
		ApplicationException obj = new ApplicationException();
		obj.setMessage(e.getMessage());
		obj.setStatus(HttpStatus.BAD_REQUEST);
		return new ResponseEntity<ApplicationException>(obj, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({MethodArgumentTypeMismatchException.class})
	public ResponseEntity<ApplicationException> invalidInputExceptionHandler(MethodArgumentTypeMismatchException ex) {
		ApplicationException obj = new ApplicationException();
		obj.setMessage("NumberFormatException - Argument should be a Numeric Value");
		obj.setStatus(HttpStatus.BAD_REQUEST);
		return new ResponseEntity<ApplicationException>(obj, HttpStatus.BAD_REQUEST);
	}

}
