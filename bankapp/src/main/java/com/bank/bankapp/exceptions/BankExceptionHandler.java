package com.bank.bankapp.exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class BankExceptionHandler extends ResponseEntityExceptionHandler {
	
    private SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SS");
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<?> genericException(
			Exception ex, WebRequest webRequest) {
		
		ExceptionResponse exception=new ExceptionResponse(ex.getLocalizedMessage(),ex.getMessage(),sdf.format(new Date()));

		return new ResponseEntity<Object>(exception,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(BankException.class)
	public final ResponseEntity<?> handleBankException(BankException ex,WebRequest webRequest){
		
		ExceptionResponse exception=new ExceptionResponse(ex.getMessage(),ex.getDetails(),sdf.format(new Date()));
		
		return new ResponseEntity<Object>(exception,HttpStatus.BAD_REQUEST);
		
	}

}
