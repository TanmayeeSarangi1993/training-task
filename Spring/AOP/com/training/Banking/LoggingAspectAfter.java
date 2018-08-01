package com.training.Banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAfter {
	
	@After("execution(* get*())")
	public void afterGetter() {
		System.out.println("after advice invoked");
	}

	@AfterReturning("execution(* com.training.model.SBAccount.getAcc())")
	public void aftersucessfullGetter() {
		System.out.println("after sucessfull invoked");
	}
	
	@AfterReturning(pointcut ="args(val)",returning ="returnString")
	public void AfterReturnStringSetter(String val,String returnString) {
		System.out.println("After invoked for Input ->" +val + ",return ->"+returnString);
	}
	
	@AfterThrowing("execution(*throw*())")
	public void afterException() {
		System.out.println("invoke all exception");
	}
}
