package com.oracle.bank.atm;

/*
 * @author: Anuj  Developer
 * Description: BankImp2  class implements withdraw()
 */

public class BankImp2 extends BankImp1{

	@Override
	public void withdraw() {
		
		BankImp2 b = new BankImp2();
		
		b.loginAuth();
		
	
		

		System.out.println("Withdraw successful...");
		
	}
	
	

}
