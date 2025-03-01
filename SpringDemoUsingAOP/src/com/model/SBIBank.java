package com.model;

public class SBIBank implements BankDAOProvider
{
	String acno;
	float balance;
	public SBIBank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBIBank(String acno, float balance) {
		super();
		this.acno = acno;
		this.balance = balance;
	}
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public void deposit(String acno, float amount) 
	{
		if(this.acno.equals(acno))
		{
			balance=balance+amount;
			System.out.println("Deposited Successfully...!!");
			System.out.println("Your current balance : "+balance);
		}

		
	}
	@Override
	public void withdraw(String acno, float amount)
	{
		try {
			if(this.acno.equals(acno))
			{
				if(balance>amount)
				{
					balance=balance-amount;
					System.out.println("Withdrawn : "+amount);
					System.out.println("Available balance : "+balance);
				}
				else
				{
					throw new Exception("Testing.....");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String toString() {
		return "SBIBank [acno=" + acno + ", balance=" + balance + "]";
	}
	
}
