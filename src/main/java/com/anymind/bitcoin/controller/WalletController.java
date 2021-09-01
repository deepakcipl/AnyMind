/**
 * 
 */
package com.anymind.bitcoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anymind.bitcoin.dto.CommonResponseDto;
import com.anymind.bitcoin.dto.WalletAddAmountRequestDto;
import com.anymind.bitcoin.service.WalletService;

import ch.qos.logback.core.joran.spi.NoAutoStart;

/**
 * @author Deepak
 *
 */
@RestController
@RequestMapping("/wallet")
public class WalletController {

	
	@Autowired
	private WalletService walletService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addAmount(@RequestBody WalletAddAmountRequestDto walletAddRequest) {

		CommonResponseDto commonResponseDto = walletService.addAmount(walletAddRequest);
		
		return new ResponseEntity(commonResponseDto, HttpStatus.OK);
	}
	
	
}
