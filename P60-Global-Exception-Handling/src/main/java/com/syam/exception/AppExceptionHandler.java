package com.syam.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handelAE(ArithmeticException ae){
		ExceptionInfo exceptionInfo = new ExceptionInfo();
		exceptionInfo.setMsg(ae.getMessage());
		exceptionInfo.setCode("AE1004");
		return new ResponseEntity<>(exceptionInfo,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
