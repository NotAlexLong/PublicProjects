# Charles Long and Bryce Butcher's Computer Science 1 Homework 2 Report
Description: This is the official report from Charles Long over the Computer Science I Homework assignment 2.

## Problem 1: My Code
```Java
System.out.println("Hello Charles Long and Bryce Butcher!");
```

## Problem 1: Partner Code
```Java
System.out.println("Hello Bryce and Charles");
```

## Problem 1: Output
Hello Charles Long and Bryce Butcher!

## Problem 1: Discussion
Simple print statment greeting the user.

## Problem 2: My Code
```Java
int CharlesMonth = 7, CharlesDay = 22;
int BryceMonth = 4, BryceDay = 21;
System.out.println("Charles' birthday is 7/22 and Bryce's Birthday is 4/21, added together they are: " + (CharlesMonth + BryceMonth) + "/" + (CharlesDay + BryceDay));
```

## Problem 2: Partner Code
```Java
int brycemonth = 4, bryceday = 21;
            int charlesmonth = 7, charlesday = 22;
           
            System.out.println("Charles' birthday is 7/22 and Bryce's birthday is 4/21. Added together they are: " + (brycemonth + charlesmonth) + "/" + (bryceday + charlesday));;
```

## Problem 2: Output
Charles' birthday is 7/22 and Bryce's Birthday is 4/21, added together they are: 11/43

## Problem 2: Discussion
Print statment that adds the numbers of the months and days togther.

 
## Problem 3: My Code
```Java
double BryceShoe = 11, CharlesShoe = 11.5;
double BryceNumber = 3, CharlesNumber = 17;
System.out.println("Bryce's Shoe Size * Favorite Number is"  + (BryceShoe * BryceNumber));
System.out.println("Charles' Shoe Size * Favorite Number is"  + (CharlesShoe * CharlesNumber));
```

## Problem 3: Partner Code
```Java
            double bryceshoe = 11, charlesshoe = 11.5;
            int brycenumber = 3, charlesnumber = 17;
            System.out.println("Bryce's Shoe Size * Favorite Number is "  + (bryceshoe * brycenumber));
            System.out.println("Charles' Shoe Size * Favorite Number is "  + (charlesshoe * charlesnumber));
```

## Problem 3: Output
Bryce's Shoe Size * Favorite Number is 33
Charles' Shoe Size * Favorite Number is 195.5

## Problem 3: Discussion
Multiplies the size of the shoe and favorite number of both Bryce and Charles

## Problem 4: My Code
```Java
System.out.println(Math.PI);
```

## Problem 4: Partner Code
```Java
System.out.println(Math.PI);
```

## Problem 4: Output
3.141592653589793

## Problem 4: Discussion
Prints out the approximation of Pi using a variable from the Math class.

# Full Java Code
``` Java
public class CharlesLongCS1HW2{
  public static void main(String [] args){
    int CharlesMonth = 7, CharlesDay = 22;
    int BryceMonth = 4, BryceDay = 21;
    double BryceShoe = 11, CharlesShoe = 11.5;
    double BryceNumber = 3, CharlesNumber = 17;
  
    System.out.println("Hello Charles Long and Bryce Butcher!");
    System.out.println("Charles' birthday is 7/22 and Bryce's Birthday is 4/21, added together they are: " + (CharlesMonth + BryceMonth) + "/" + (CharlesDay + BryceDay));
    System.out.println("Bryce's Shoe Size * Favorite Number is"  + (BryceShoe * BryceNumber));
    System.out.println("Charles' Shoe Size * Favorite Number is"  + (CharlesShoe * CharlesNumber));
    System.out.println(Math.PI);
  }
}
```

