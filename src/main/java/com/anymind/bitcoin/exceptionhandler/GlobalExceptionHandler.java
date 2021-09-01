/**
 * 
 */
package com.anymind.bitcoin.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.anymind.bitcoin.constants.AppConstants;
import com.anymind.bitcoin.dto.CommonResponseDto;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	@SuppressWarnings("rawtypes")
	@ExceptionHandler(InternalServerError.class)
	public ResponseEntity<Object> internalServerError() {
		 

		CommonResponseDto commonResponseDto= new CommonResponseDto();
		commonResponseDto.setStatusCode(AppConstants.INTERNAL_SERVER_ERRROR_STATUS_CODE);
		commonResponseDto.setMessage(AppConstants.INTERNAL_SERVER_ERRROR_MSG); 

		return new ResponseEntity(commonResponseDto, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@SuppressWarnings("rawtypes")
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<Object> badRequest() {
		 

		CommonResponseDto commonResponseDto= new CommonResponseDto();
		commonResponseDto.setStatusCode(AppConstants.BAD_REQUEST_STATUS_CODE);
		commonResponseDto.setMessage(AppConstants.BAD_REQUEST_MSG); 

		return new ResponseEntity(commonResponseDto, HttpStatus.BAD_REQUEST);
	}

}
