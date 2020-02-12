package com.javalec.ex;

public class Grade {
	private int kor;
	private int math;
	private int eng;
	private GradeCal gradeCal;
	
	public void gradeCalculation() {
		gradeCal.avg(kor, math, eng);
	}
	
	
	public void setGradeCal(GradeCal gradeCal) {
		this.gradeCal = gradeCal;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}

