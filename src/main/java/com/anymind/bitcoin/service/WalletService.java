/**
 * 
 */
package com.anymind.bitcoin.service;

import com.anymind.bitcoin.dto.CommonResponseDto;
import com.anymind.bitcoin.dto.WalletAddAmountRequestDto;

/**
 * @author Deepak
 *
 */
public interface WalletService {

	public CommonResponseDto addAmount(WalletAddAmountRequestDto wallerAddRequest);	
}
