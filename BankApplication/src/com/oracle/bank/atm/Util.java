package com.oracle.bank.atm;
// @author: javeed TL
public class Util {
	
	
	public  static IBank  getObject(){
		
		
		 return new BankImp2();
	}
	

}
