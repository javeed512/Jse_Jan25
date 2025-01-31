package com.oracle.bank.atm;

/*
 * @author: Javeed TL
 * Description: IBank interface is open for all people
 */


public interface IBank {
	
	public static final String IFSC = "HDFC1234";
	
	public abstract  void deposit();
	  void withdraw();

}
