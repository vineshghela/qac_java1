package com.qa.stringMethods;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    	//   0123
		String str1 = "TeXt";
		
		System.out.println(str1.length()); //4
		System.out.println(str1.toLowerCase());//text
		System.out.println(str1.charAt(3)); //t
		System.out.println(str1.indexOf("e"));//1
		System.out.println(str1.endsWith("t"));
		System.out.println(str1.contains("Xt"));
		// things to remember 
		//start index is inclusive
		//endindex is exclusive
		System.out.println(str1.substring(0,3));

	}

}
