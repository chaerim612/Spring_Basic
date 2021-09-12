package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdvisorClass {
	
	@Before("execution(* method1())")
	public void beforeMethod() {
		System.out.println("beforeMethod() 호출");
	}
	
	//=========================================================
	
	@After("execution(* method1())")
	public void afterMethod() {
		System.out.println("afterMethod() 호출");
	}
	
	//=========================================================
	
	@Around("execution(* method1())")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aroundMethod() 호출");
		Object result=pjp.proceed();
	}
	
	//=========================================================
	
	@AfterThrowing("execution(* method1())")
	public void afterThrowingMethod(Throwable e) {
		e.printStackTrace();
	}
}
