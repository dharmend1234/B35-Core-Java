package com.capgemini.application;

import com.capgemini.framework.BankFactory;
import com.capgemini.framework.CurrentAcc;
import com.capgemini.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimited) {
		MMCurrentAcc c=new MMCurrentAcc(accNo,accNm,accBal,creditLimited);
		return c;
	}

}
