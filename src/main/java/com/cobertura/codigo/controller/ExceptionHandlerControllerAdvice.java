package com.cobertura.codigo.controller;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	@ExceptionHandler(NoSuchElementException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleNoSuchElementException(NoSuchElementException e) {
		return e.getMessage();
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleIllegalArgumentException(IllegalArgumentException e) {
		return e.getMessage();
	}
}
