/**
 * 
 */
package com.anymind.bitcoin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.anymind.bitcoin.model.WalletGenerateReport;
import com.anymind.bitcoin.model.WalletReportData;

/**
 * @author Deepak
 *
 */
@Mapper
public interface ReportMapper {

	public List<WalletReportData> getHourlyReport(WalletGenerateReport generateReport);

}
