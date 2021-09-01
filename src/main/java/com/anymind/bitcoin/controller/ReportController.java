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
import com.anymind.bitcoin.dto.WalletReportRequestDto;
import com.anymind.bitcoin.service.WalletReportService;

/**
 * @author Deepak
 *
 */
@RestController
@RequestMapping("/wallet")
public class ReportController {

	@Autowired
	private WalletReportService walletReportService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/report", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getHourlyReport(@RequestBody WalletReportRequestDto walletReportRequest) {

		CommonResponseDto commonResponseDto = walletReportService.getHourlyReport(walletReportRequest); 

		return new ResponseEntity(commonResponseDto, HttpStatus.OK);
	}
	
}
