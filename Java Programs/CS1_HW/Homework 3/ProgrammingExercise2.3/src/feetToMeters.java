/*
 * Author: Charles Long & Anderw Womack
 * Assignment: Programming Exercise 2.3
 * Description: Prompts the user to enter in the amount of feet they would like to conver to meters. 
 */

import java.util.Scanner; // Importing the Scanner class.
public class feetToMeters {
	public static void main(String[] args) {
		// Making a scanner object
		Scanner in = new Scanner(System.in);
		
		// Prompting user for input.
		System.out.println("Enter the number of feet for conversion to meters: ");
		double feet = in.nextDouble();
		
		// Formula to convert feet to meters
		double meters = feet * .305;
		
		// Final print statment for the console.
		System.out.println("There are " + meters + " meters in " + feet + " feet.");
	}
}
