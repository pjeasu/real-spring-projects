package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		MyCalculation myCalculation = new MyCalculation();
//		myCalculation.setCalculator(new Calculation()); //주입
//		
//		myCalculation.setFirstNum(10);
//		myCalculation.setSecondNum(2);
//		
//		myCalculation.add();
//		myCalculation.sub();
//		myCalculation.mul();
//		myCalculation.div();

		
		
		
//		------------------------------------------------------------------------------------
		
//		//스프링 활용
//		String configLocation = "classpath:appCTX.xml";
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
//		//GenericXmlApplicationContext : 스프링  IoC 컨테이너
//		
//		MyCalculation myCalculation = ctx.getBean("myCalculation", MyCalculation.class);
//		
//		myCalculation.add();
//		myCalculation.sub();
//		myCalculation.mul();
//		myCalculation.div();
		
		
//		------------------------------------------------------------------------------------	
		
//		//MyCalculation / BMICalculator / MyInfo
//		
//		String configLocation = "classpath:appCTX2.xml";
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
//		
//		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
//		myInfo.getInfo();
		
		
		
		
//		------------------------------------------------------------------------------------	
	
		
//		String configLocation = "classpath:appCTX3.xml";
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
//		Circle circle = ctx.getBean("circle", Circle.class);
//		//circle.setRadius(10);
//		System.out.println(circle.getArea());
		
		
		
		
//		------------------------------------------------------------------------------------	
	
		
		String configLocation = "classpath:appCTX4.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Grade grade = ctx.getBean("grade", Grade.class);
		grade.gradeCalculation();
		
		
	}
	
}
				