//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		System.out.println("Week-01 Lab");
		
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight
		int availableSeats = 10;

		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 20.0;

		
		// 3. Create a variable to hold a person's middle initial
		char middleNameInitial = 'A';

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHot = true;

		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Smith";

		
		// 6. Create a variable to hold a street address
		String streetAddress = "6060 Flamingo Rd";
		

		// 7. Print all variables to the console
		System.out.println("Available plane seats: " + availableSeats);
		System.out.println("Cost of Groceries: " + costOfGroceries);
		System.out.println("Middle Name Initial: " + middleNameInitial);
		System.out.println("Hot outside: " + isHot);
		System.out.println("Customer First Name: " + customerFirstName);
		System.out.println("street Address: " + streetAddress);
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availableSeats = availableSeats - 2;
		System.out.println("\nAvailable plane seats: " + availableSeats);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries = costOfGroceries + 2.15;
		System.out.println("\nCost of Groceries: " + costOfGroceries);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleNameInitial = 'T' ;
		System.out.println("\nMiddle Name Initial: " + middleNameInitial);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHot = false;
		System.out.println("\nHot outside: " + isHot);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleNameInitial + " John";
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		
		
		System.out.println("\nHi. my name is " + fullName + " and I live at " + streetAddress);

		
		
	}
}
