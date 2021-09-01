/**
 * 
 */
package com.anymind.bitcoin.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anymind.bitcoin.constants.AppConstants;
import com.anymind.bitcoin.dto.CommonResponseDto;
import com.anymind.bitcoin.dto.WalletReportRequestDto;
import com.anymind.bitcoin.exceptionhandler.BadRequestException;
import com.anymind.bitcoin.exceptionhandler.InternalServerError;
import com.anymind.bitcoin.mapper.ReportMapper;
import com.anymind.bitcoin.model.WalletGenerateReport;
import com.anymind.bitcoin.model.WalletReportData;
import com.anymind.bitcoin.service.WalletReportService;

/**
 * @author Deepak
 *
 */
@Service
@Transactional
public class WalletReportServiceImpl implements WalletReportService {

	@Autowired
	private ReportMapper reportMapper;

	public CommonResponseDto getHourlyReport(WalletReportRequestDto walletReportRequest) {

		CommonResponseDto commonResponseDto = new CommonResponseDto();
		commonResponseDto.setStatusCode("S200");

		DateFormat df = new SimpleDateFormat(AppConstants.DATE_FORMATTER);

		try {
			WalletGenerateReport generateReport = new WalletGenerateReport();
			generateReport.setStartDateTime(df.parse(walletReportRequest.getStartDatetime()));
			generateReport.setEndDateTime(df.parse(walletReportRequest.getEndDatetime()));
			List<WalletReportData> dataList = reportMapper.getHourlyReport(generateReport);

			commonResponseDto.setData(dataList);

		} catch (ParseException e) {
			
			throw new BadRequestException();
		} catch (RuntimeException e) {
			
			throw new InternalServerError();
		}
		
		return commonResponseDto;
	}
}
