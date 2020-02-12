package com.javalec.ex;

public class GradeCal {
	private int A;
	private int B;
	private int C;
	private int D;

	
	public void avg(int kor, int math, int eng) {
		int avg = (kor + math + eng) / 3;
		
		System.out.println("평균 : " + avg);
		System.out.print("등급 : ");
		if(avg > A) {
			System.out.println("수");
		}else if(avg > B) {
			System.out.println("우");
		}else if (avg > C) {
			System.out.println("미");
		}else if (avg > D) {
			System.out.println("미");
		}else {
			System.out.println("양");
		}
	}

	public void setA(int a) {
		A = a;
	}

	public void setB(int b) {
		B = b;
	}

	public void setC(int c) {
		C = c;
	}

	public void setD(int d) {
		D = d;
	}

	
}
