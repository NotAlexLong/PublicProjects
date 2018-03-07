# Discussion

### Problem 1
Feet to Meters program was easy to write because it only needed scanner, 1 math problem, and a print statment.

### Problem 2
The next program was the Math Pow Table, it was the easiest because I was able to use a loop to automate the process.

### Problem 3
The last program was the hardest to write because the formulas were hard to work with. The strategy I used was to split it up and do things in smaller chunks.


# Git Log Activity
``` sh
commit e25aff1e783270894ccb86fca246dd91ef05f8bf (HEAD -> master, origin/master, origin/HEAD)
Author: CharlesALong <charleslong.personal@gmail.com>
Date:   Sun Oct 1 13:34:42 2017 -0500

    Adding files from homework chapter 3
```

# Problem 1: 2.3
``` Java
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
```

# Problem 2: 2.18
``` Java
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
```

# Problem 3: 2.21
``` Java
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
```