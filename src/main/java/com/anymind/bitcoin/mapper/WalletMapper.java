/**
 * 
 */
package com.anymind.bitcoin.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.anymind.bitcoin.dto.WalletAddAmountRequestDto;
import com.anymind.bitcoin.model.WalletAddAmount;

/**
 * @author Deepak
 *
 */
@Mapper
public interface WalletMapper {

	
	public int addAmount(WalletAddAmount walletAddAmount);
	
}
