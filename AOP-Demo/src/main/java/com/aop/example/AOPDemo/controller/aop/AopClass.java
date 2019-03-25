package com.aop.example.AOPDemo.controller.aop;

//Static - Compile Time
//Aspect : Logging - Concern we trying to implement, here its logging
//PointCut : An expression that determines which methods to be tracked
  //execution(* com.aop.example.AOPDemo.controller.UserController.*(..))
//Advice: Action taken by an aspect at particular joint point
 //Inside method logics

//Dynamic - Run time
//JoinPoint : Point during execution of program
//Weaving : linking aspect as a whole

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopClass {
	
	@Before("execution(* com.aop.example.AOPDemo.controller.UserController.*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("Before Process");
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(joinPoint.getArgs());
	}
	
	@After("execution(* com.aop.example.AOPDemo.controller.UserController.*(..))")
	public void after(JoinPoint joinPoint) {
		System.out.println("After process");
		System.out.println(joinPoint.getSignature().getName());
	}
	
	@AfterReturning(pointcut="execution(* com.aop.example.AOPDemo.controller.UserController.*(..))"
			,returning="result")
	public void afterResult(JoinPoint jointPoint,Object result) {
		System.out.println("Final process");
		System.out.println(jointPoint.getSignature().getName());
		System.out.println("Result is " + result);
	}
	
	
}
