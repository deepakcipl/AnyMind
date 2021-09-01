/**
 * 
 */
package com.anymind.bitcoin.model;

import java.util.Date;

/**
 * @author Deepak
 *
 */
public class WalletAddAmount {

	private Date dateTime;
	private long amount;
	private String remark;
	private Date registerDateTime;
	
	/**
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}
	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @return the registerDateTime
	 */
	public Date getRegisterDateTime() {
		return registerDateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @param registerDateTime the registerDateTime to set
	 */
	public void setRegisterDateTime(Date registerDateTime) {
		this.registerDateTime = registerDateTime;
	}
	
	
}
