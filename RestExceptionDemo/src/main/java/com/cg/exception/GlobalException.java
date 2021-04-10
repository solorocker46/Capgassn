package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> handleException(IdNotFoundException e)
	{
		return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(PriceException.class)
	public ResponseEntity<Object> handleException(PriceException e)
	{
		return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
