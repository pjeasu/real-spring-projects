package com.javalec.ex;

public class MyCalculation {
	Calculation calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculation() {
		
	}
	
	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	
	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void mul() {
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div() {
		calculator.addition(firstNum, secondNum);
	}

	public void setCalculator(Calculation calculator) {
		this.calculator = calculator;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	

	
	
}
