/*
 * Author: Charles Long & Anderw Womack
 * Assignment: Programming Exercise 2.21
 * Description: Calculates monthly interest rate and finally total value after specified number of years. 
 */

import java.util.Scanner;

public class calculateFutureInvestment {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Prompts the user for the required information
		System.out.println("Investment Amount: ");
		double investmentAmount = in.nextDouble();
		System.out.println("Enter yearly interest rate in percentage: ");
		double interestPercent = in.nextDouble();
		System.out.println("Enter number of years: ");
		double years = in.nextDouble();
		
		// Calculates monthly interest rate then the total accumulated value.
		double monthlyRate = interestPercent / 1200.0; 
		double accumulatedValue = investmentAmount * Math.pow((1 + monthlyRate), years*12);
		
		// Prints out the final value.
		System.out.println("Accumulated value is: $" + accumulatedValue);
	}
}