package com.qac.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
//		int num[] = {0,1,2,3,4,5,6,7,8,9,0,2,3,34,5};
//		//i=0
//		for (int i:num) {
//			System.out.println("Number: "+i);
//		}
		
		
//		int twoDArray[][] = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};
//		//columns
//		for (int i = 0; i < twoDArray.length; i++) {
//		//rows
//		for (int j = 0; j < twoDArray[i].length; j++) {
//			System.out.print(twoDArray[i][j]);
//		}
//		// after each row, print a new line
//		System.out.println();
//		}
		
//		int twoDArray[][] = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};
//		// columns
//		for (int[] a : twoDArray) {
//		// rows
//		for (int b : a) {
//			System.out.print(b);
//		}
//		System.out.println();
//		}
		
		//array lists of Strings
		
		ArrayList<String> daysOfWeek = new ArrayList<String>();
		daysOfWeek.add("Mon");
		daysOfWeek.add("Tues");
		daysOfWeek.add("Wed");
		daysOfWeek.add("Thurs");
		daysOfWeek.add("Fri");
		daysOfWeek.add("sat");
		daysOfWeek.add("sun");
		
		//System.out.println(daysOfWeek.get(1));
		
		for(int i =0; i<daysOfWeek.size();i++) {
			System.out.println(daysOfWeek.get(i));
		}
		daysOfWeek.remove("sun");
		daysOfWeek.remove(1);
		for(int i =0; i<daysOfWeek.size();i++) {
			System.out.println(daysOfWeek.get(i));
		}
		//
		
	//linked list 
	LinkedList<Integer> cars = new LinkedList<Integer>();
//	cars.addAll(1,2,3,4,5,6,7,8,9);
//	cars.add("BMW");
//	cars.add("SEAT");
//		
//	System.out.println("The cars are: " + cars);
//	
//	System.out.println(cars.removeFirst());
//	System.out.println(cars);
//		
		
		
		
		
		
		

//		Scanner s = new Scanner(System.in);
//		System.out.println("What is your name?");
//		String name = s.nextLine();
//
//		System.out.println("What is your age");
//		int age = s.nextInt();
//
//		System.out.println("Hi " + name + ", next year you will be" + (age + 1));
//

		
	}
	
	

}
