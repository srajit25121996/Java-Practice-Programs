package com.oops.inheritence;

public class BankFunction {
	
	

	public void openAccount() {
		System.out.println("Bank account is opened.");
	}

	public void closeAccount() {
		System.out.println("Bank account is closed.");
	}

	public void deposit(int amount) {
		int total=100;
		total+=amount;
		System.out.println("Amount has been deposited :"+ amount);
		System.out.println("Current balance : "+total);
		
	}

	
	public void withdraw(int amount) {
		int total=100;
		total-=amount;
		System.out.println("Amount has been Withdrawl :"+ amount);
		System.out.println("Current balance : "+total);
		
	}

}
