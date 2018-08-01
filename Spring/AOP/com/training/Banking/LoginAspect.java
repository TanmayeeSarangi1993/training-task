package com.training.Banking;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoginAspect {

	//@Before("within(com.training.model.Account)")
	//@Before("execution(public double getBalance())")
	
	
	//we cn also hv fully qualified named
	//@Before("execution(public doublcom.training.model.CAAccount.showBalance())")
	//@Before("execution(public * get*())")
	//@Before("execution(public * get*(*))")
	
	//@Before("execution(public doublcom.training.model.*.getBalance())")
	//public void loginAdviceBefore() {
	//	System.out.println("******login before called********");
	//}
	
@Before("allGetters()")
public void secondAdvise() {
		System.out.println("2nd aspect.....");
	}
	@Before("allGetters() || allGettersSBAccount()")
	public void compountAdvice() {
		System.out.println("This is coumpound advicer for or"+"clause of....");
	}
	
	
	//if u hv too many advice its digfficult
	//so we are using dumy methiod insteed of annotation
	
	@Pointcut("execution(* get*(..))")
	public void allGetters() {
		System.out.println("this data shoul;d not be display");
	}
	
	@Pointcut("execution(public double com.training.model.SBAccount.getAcc())")
	public void allGettersSBAccount() {
		System.out.println("this data shoul;d not be display");
	}
}
