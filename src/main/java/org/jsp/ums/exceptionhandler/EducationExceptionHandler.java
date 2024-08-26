package org.jsp.ums.exceptionhandler;

import org.jsp.ums.exceptionclasses.InvalidEducationIdException;
import org.jsp.ums.responsestructure.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EducationExceptionHandler {
	@ExceptionHandler(InvalidEducationIdException.class)
	public ResponseEntity<?> inavlidUserIdExceptionHandler(InvalidEducationIdException e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ResponseStructure.builder().status(HttpStatus.BAD_REQUEST.value()).message("Invalid Education Id").body(e.getMessage()).build());
	}
}
