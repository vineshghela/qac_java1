package com.qac.stringCheck;

public class CheckString {

//	•	Has a method that when given a String, checks that it matches a hard-coded String.

	public boolean checkMatch(String str) {

		boolean bool = true; // declare a bool default value true;
		String str2 = "Hello"; // declare a string of value Hello
		if (str == str2) { // check is the first string is equal to the second string
			bool = true; // set the value of bool to true
		} else {
			bool = false; // set the value of bool to false
		}
		return bool; // finally return the value of bool.
	}

//	•	Has a method that when given 2 Strings, compares the Strings and checks if they are equal.

}
