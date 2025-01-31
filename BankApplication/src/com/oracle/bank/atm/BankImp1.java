package com.oracle.bank.atm;

/*
 * @author: Surya  Developer
 * Description: BankImp1 class implement deposit method
 */
public abstract class BankImp1  implements IBank{

	@Override
	public void deposit() {


		System.out.println("Deposit Successful...");
		
	}

	public abstract void withdraw();

}
