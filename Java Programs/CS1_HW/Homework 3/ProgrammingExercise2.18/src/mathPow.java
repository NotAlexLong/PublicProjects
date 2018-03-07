/*
 * Author: Charles Long & Anderw Womack
 * Assignment: Programming Exercise 2.18
 * Description: Prompts the user to enter the amount of times they want to see the loop ran.
 * Creates a table of numbers and powers incremented by 1 and what the result of them combined is.
 */

import java.util.*;
public class mathPow {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 1, b = 2;
		
		System.out.println("How many powers would you like to print?: ");
		int num = in.nextInt();
		
		System.out.println("a\tb\tpow(a,b)");
		for(int i = 1; i <= num; i++, a++, b++) {
			String numStr = Math.pow(a, b) + "";
			System.out.println(a + "\t" + b + "\t" + Integer.parseInt(numStr.substring(0, numStr.length()-2)));
		}
	}
}
