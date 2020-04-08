package com.qac.whileLoop;

import java.util.Locale.Category;

public class Runner {

	public static void main(String[] args) {

		int catCount = 0;
		boolean notEnoughCats = true;
//
//		while (notEnoughCats) {
//			System.out.println("Another cat " + catCount);
//			catCount++;
//
//			if (catCount > 5)
//				notEnoughCats = false;
//		}
//		System.out.println("Too many cats what to do!!!");
		
		
		do {
			System.out.println("more cats " +catCount); 
			catCount++; // 1,2,3
			if(catCount>5)
			notEnoughCats = false;
		}while(notEnoughCats);
		System.out.println("We are done!");
	}
	
	
	
	
}
