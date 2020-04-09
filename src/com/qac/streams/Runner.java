package com.qac.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		//List
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6","7","8");
		//print the current array values numbers
		System.out.println("original list: " + numbers);
		List<Integer> even = numbers.stream()
				//getting the integer value from the string
				.map(s -> Integer.valueOf(s))
				//check if it is even 
				.filter(number -> number % 2 == 0)
				//.filter(number -> number % 2 == 1)
				//collect into list even 
				.collect(Collectors.toList());
		//print list
		System.out.println("processed list, only even numbers: " + even);

	
//		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//		System.out.println(strings);
//		List<String> filtered = strings.stream()
//				//check each item and check that it is not empty
//				.filter(s -> !s.isEmpty())
//				//add the remaining items back to filtered
//				.collect(Collectors.toList()
//		);
		//System.out.println(filtered);

	}

}
