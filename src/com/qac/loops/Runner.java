package com.qac.loops;

public class Runner {

	public static void main(String[] args) {
		
//		for (int i=0; i<=100;i++) {
//			System.out.println("The value of i is:" +i);
//		}
		
		for (int i=0; i<=10;i++) {
			if(i==7)
				break;
			if(i==2)
				continue;
			System.out.println(i);
		}
		
		

	}

}
