package com.qac.day1.cal;

public class Calc {
	
	int num = 0;
	
	public int addCal(int a, int b) {
		int c = a+b; // a+b =c  10+3=13
		//System.out.println(c);
		return c;//13
	}
	public int subCal(int a, int b) {
		int c= a-b;
		return c;
	}
	
	public int addThree(int a, int b, int c, int e) {
		int d = a+b+c+e;
		return d;
	}
	
	public String hello(String a) {
		System.out.println(a);
		return a;
		
	}

}
