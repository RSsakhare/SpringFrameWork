package com.aspect;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{
	@Before("execution(* com.model.SBIBank.deposit(..))")
	public void logInfoBefore(JoinPoint joinPoint)
	{
		Date d = new Date();
		System.out.println("Today is : "+d);
		System.out.println("........Aspect Before Deposit Logging Info.......");
	}
	
	@After("execution(* com.model.SBIBank.deposit(..))")
	public void logInfoAfter1(JoinPoint joinPoint)
	{
		Date d = new Date();
		System.out.println("Today is : "+d);
		System.out.println("........Aspect After Deposit Logging Info.......");
	}
	
	@After("execution(* com.model.SBIBank.withdraw(..))")
	public void logInfoBefore1(JoinPoint joinPoint)
	{
		Date d = new Date();
		System.out.println("Today is : "+d);
		System.out.println("........Aspect Before withdraw");
	}
	
	@After("execution(* com.model.SBIBank.withdraw(..))")
	public void logInfoAfter(JoinPoint joinPoint)
	{
		Date d = new Date();
		System.out.println("Today is : "+d);
		System.out.println("........Aspect After withdraw");
	}
	
	@AfterThrowing("execution(* com.model.SBIBank.withdraw(..))")
	public void logError(JoinPoint joinPoint)
	{
		System.out.println("........Aspect Throwing Error");
	}
}
