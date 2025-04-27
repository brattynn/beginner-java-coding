/*
Write a program that takes in a positive integer as input, and outputs a string of 1's and 0's representing the integer in reverse binary. Print a newline after the string of 1's and 0's. For an integer x, the algorithm is:

As long as x is greater than 0
   Output x % 2 (remainder is either 0 or 1)
   x = x / 2

Note: The above algorithm outputs the 0's and 1's in reverse order.

Ex: If the input is:

6

the output is:

011

6 in binary is 110; the algorithm outputs the bits in reverse.

*/

//PROVIDED STARTING CODE:

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
   }
}

//--------------------------------------------------------------------------------
//MY SOLUTION

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int x;
      
      x = scnr.nextInt();
      
      while (x > 0) {
         System.out.print(x % 2);
         x = x / 2;
      }
      
      System.out.println();
   }
}


//----------------------------------------------------------------------------------

//CHATGPT PRACTICE PROBLEMS

/*
Practice Lab 1: Reverse Digits of a Number
Problem: Write a program that reads a positive integer from the user and prints each digit in reverse order (one per line).
Example:
   Input: 572
   Output:
   2
   7
   5

Hints:
    Use % 10 to get the last digit.
    Use / 10 to chop off the last digit.
    Use a while loop.


Practice Lab 2: Count Number of 1’s in Binary
Problem: Write a program that reads a positive integer and counts how many 1s are in its binary representation (in reverse order like before).
Example:
   Input: 13
      Binary (normal) = 1101
      Reverse output = 1011
      There are 3 ones.

   Hints:
    Use % 2 to check if the current digit is 1.
    If it's 1, add 1 to a counter.
    Keep dividing by 2 until you reach 0.


Practice Lab 3: Build a String of 0’s and 1’s
Problem: Write a program that reads a positive integer and builds a string (instead of immediately printing) containing the reversed binary digits, then prints the string at the end.
Example:
   Input: 5

   (5 in binary = 101)
   (reverse = 101)

   Output: 101

Hints:
    Instead of System.out.print(x % 2); directly inside the loop, add the remainder (0 or 1) to a String.
    After the loop finishes, print the full string with System.out.println().


Topics These Problems Practice:
Concept:	                  Why it's important:
while loops	               Repeat actions until a condition fails
% modulus	               Getting last digit or remainder
/ integer division	      Shrink the number step-by-step
Building strings	         Not always printing right away
Accumulating counters	   When counting things (like 1’s)


*/
