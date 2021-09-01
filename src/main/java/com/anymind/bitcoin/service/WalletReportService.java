/**
 * 
 */
package com.anymind.bitcoin.service;

import com.anymind.bitcoin.dto.CommonResponseDto;
import com.anymind.bitcoin.dto.WalletReportRequestDto;

/**
 * @author Deepak
 *
 */
public interface WalletReportService {

	
	public CommonResponseDto getHourlyReport(WalletReportRequestDto walletReportRequest);	
}
