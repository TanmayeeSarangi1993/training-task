package com.training.Banking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogginAspectAround {

	@Around("execution(public * get* ()))")
	
	public Object sampleMyArroundAdvise(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object retval = null;
		
		try {
		System.out.println("Before job goes here....");
		retval = proceedingJoinPoint.proceed();
	   System.out.println("After jonb goes");
		}catch(Throwable e) {
			e.printStackTrace();
		}
		return retval;

}
}
