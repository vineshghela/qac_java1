package com.qac.conditionals;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean isDevCool = true;
//		boolean isDrunk = false;
//		
//		//& both parts must be true 
//		//| only one part of the statement has to be true
//		// true & false 
//		if(isDevCool & isDrunk ) {
//			System.out.println("Dev is cool");
//		}else {
//			System.out.println("Dev is NOT cool");
//		}
		
		
		String day = "Monday"; // case 5
		switch (day) {
		case "Monday":
		System.out.println("Monday you can fall apart");
			boolean bool = true;
			if(bool) {
				System.out.println("hello");
			}else {
				System.out.println("GO Away");
			}
			System.out.println("we at the end");
			System.out.println("Do you guys want to go to lunch ?");
		break;
		default:
		System.out.println("You need to listen to The Cure");
		break;
		}


	}

}
