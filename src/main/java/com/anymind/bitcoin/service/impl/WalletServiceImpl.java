/**
 * 
 */
package com.anymind.bitcoin.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anymind.bitcoin.constants.AppConstants;
import com.anymind.bitcoin.dto.CommonResponseDto;
import com.anymind.bitcoin.dto.WalletAddAmountRequestDto;
import com.anymind.bitcoin.exceptionhandler.BadRequestException;
import com.anymind.bitcoin.exceptionhandler.InternalServerError;
import com.anymind.bitcoin.mapper.WalletMapper;
import com.anymind.bitcoin.model.WalletAddAmount;
import com.anymind.bitcoin.service.WalletService;

/**
 * @author Deepak
 *
 */
@Service
@Transactional
public class WalletServiceImpl implements WalletService{
	
	@Autowired
	private WalletMapper walletMapper;

	public CommonResponseDto addAmount(WalletAddAmountRequestDto walletAddAmountRequest) {
		
		
		
		
		DateFormat df = new SimpleDateFormat(AppConstants.DATE_FORMATTER);
		
		try {
			WalletAddAmount walletAddAmount = new WalletAddAmount();
			long amountInSatoshi = (long) (walletAddAmountRequest.getAmount()*AppConstants.SATOSHI_TO_BITCOIN);
			
			walletAddAmount.setAmount(amountInSatoshi);
			walletAddAmount.setDateTime(df.parse(walletAddAmountRequest.getDatetime()));
			walletAddAmount.setRegisterDateTime(new Date());
			walletAddAmount.setRemark(walletAddAmountRequest.getRemark());
			
			walletMapper.addAmount(walletAddAmount);
		} catch (ParseException e) {
			
			throw new BadRequestException();
		} catch (RuntimeException e) {
			
			throw new InternalServerError();
		}
		
		CommonResponseDto commonResponseDto = new CommonResponseDto();
		commonResponseDto.setStatusCode("S200");
		
		return commonResponseDto;
	}
	
	
}
