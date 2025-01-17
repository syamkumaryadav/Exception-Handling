package com.syam.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syam.exception.ExceptionInfo;

@RestController
public class MyController {
	
	private Logger logger=LoggerFactory.getLogger(MyController.class);
	
	@GetMapping("/")
	public String doAction() {
		String message="this is my exception handling demo Global based......";
		try {
			
			System.out.println(10/0);
		}catch (Exception e) {
			System.out.println(e);
			logger.error("Exception occured : "+e, e);
			throw new ArithmeticException(e.getMessage());
		}
		return message;
	}
	
	
}
