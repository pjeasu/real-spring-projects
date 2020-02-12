package edu.bit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//xml파일을 이용하는게 아닌 어노테이션을 이용해 자바소스코드 안에다가 서술하는 방식

@Aspect
public class LogAop {
	
	@Pointcut("within(edu.bit.aop.*)")
	private void pointcutMethod() {
		
	}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println(signatureStr + "is start.");
		
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinPoint.proceed();
			//ProceedingJoinPoint 안에 있는 proceed 함수를 실행
			
			return obj;
		}finally {
			long et = System.currentTimeMillis();
			
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 걸리는 시간  : " + (et - st));
		}
		
	}

}

