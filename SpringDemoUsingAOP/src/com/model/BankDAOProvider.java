package com.model;

public interface BankDAOProvider 
{

	public void deposit(String acno,float amount);
	public void withdraw(String acno,float amount);
}
