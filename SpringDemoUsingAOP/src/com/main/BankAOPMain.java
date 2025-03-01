package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.BankDAOProvider;

public class BankAOPMain {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		BankDAOProvider b = (BankDAOProvider) context.getBean("bobj");
		
		b.deposit("sbi1234",5000.0f);
		System.out.println(b);
		b.withdraw("sbi1234",2000.0f);
	}

}
