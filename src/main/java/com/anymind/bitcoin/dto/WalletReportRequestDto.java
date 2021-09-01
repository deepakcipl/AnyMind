/**
 * 
 */
package com.anymind.bitcoin.dto;

/**
 * @author Deepak
 *
 */
public class WalletReportRequestDto {
	
	private String startDatetime;
	private String endDatetime;
	
	/**
	 * @return the startDatetime
	 */
	public String getStartDatetime() {
		return startDatetime;
	}
	/**
	 * @return the endDatetime
	 */
	public String getEndDatetime() {
		return endDatetime;
	}
	/**
	 * @param startDatetime the startDatetime to set
	 */
	public void setStartDatetime(String startDatetime) {
		this.startDatetime = startDatetime;
	}
	/**
	 * @param endDatetime the endDatetime to set
	 */
	public void setEndDatetime(String endDatetime) {
		this.endDatetime = endDatetime;
	}
	

}
