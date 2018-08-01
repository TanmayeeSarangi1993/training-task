package com.training.Banking;

@Aspect
public class LoginAspect {

	@Before("executoion(public double getBalance())")
	public void loginAdviceBefore() {
		System.out.println("******login before called********");
	}
	}
