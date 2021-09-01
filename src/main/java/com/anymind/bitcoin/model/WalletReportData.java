/**
 * 
 */
package com.anymind.bitcoin.model;

import java.util.Date;

import com.anymind.bitcoin.constants.AppConstants;

/**
 * @author Deepak
 *
 */
public class WalletReportData {
	
	private Date datetime;
	private long amount;
	/**
	 * @return the datetime
	 */
	public Date getDatetime() {
		return datetime;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		
		double dd = amount/(double)AppConstants.SATOSHI_TO_BITCOIN;
		
		
		return dd;
	}
	/**
	 * @param datetime the datetime to set
	 */
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	

}
