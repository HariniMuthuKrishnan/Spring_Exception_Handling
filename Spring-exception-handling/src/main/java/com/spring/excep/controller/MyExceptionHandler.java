package com.spring.excep.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.excep.exception.MyRecordNotFoundException;
import com.spring.excep.exception.NoRecordExistException;
import com.spring.excep.model.ExceptionJsonModel;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(MyRecordNotFoundException.class)
	public ResponseEntity<ExceptionJsonModel> mapException(MyRecordNotFoundException ex) {
		ExceptionJsonModel exception = new ExceptionJsonModel(HttpStatus.EXPECTATION_FAILED.value(), ex.getMessage());
		return new ResponseEntity<>(exception, HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(NoRecordExistException.class)
	public ResponseEntity<ExceptionJsonModel> mapException(NoRecordExistException ex) {
		ExceptionJsonModel exception = new ExceptionJsonModel(HttpStatus.EXPECTATION_FAILED.value(), ex.getMessage());
		return new ResponseEntity<>(exception, HttpStatus.EXPECTATION_FAILED);
	}
	
}
