//Zybook - WGU - D286
//Varied Amount of Input Data

/*
Statistics are often calculated with varying amounts of input data. 
Write a program that takes any number of non-negative integers as input, and outputs the max and average.
A negative integer ends the input and is not included in the statistics.
Assume the input contains at least one non-negative integer.

Output the average with two digits after the decimal point followed by a newline, which can be achieved as follows:
System.out.printf("%.2f\n", average);

Ex: When the input is:
  15 20 0 3 -1

the output is:
  20 9.50
*/

//SUPPLIED STARTING CODE:
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
      
   }
}



//----------------------------------------------------------------------
//MY SOLUTION:
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      
      //Variables
      int inputRead = scnr.nextInt();
      int maxVal = inputRead; //Starts with the initial input read before the while loop.
      int valCount = 0;    //To account for the value brought into inputRead initially
      int numSum = 0;
      double average = 0.0;
      
      
      while (inputRead >= 0) {
         numSum = numSum + inputRead;
         if (inputRead > maxVal) {
            maxVal = inputRead;
         }
         valCount++;
         inputRead = scnr.nextInt();
      }
      
      average = ( (numSum * 1.0) / (valCount * 1.0) );    //NOTE: THiinking about it, this could have been cleaner: average = (double) numSum / valCount;
      
      System.out.print(maxVal + " ");
      System.out.printf("%.2f\n", average);
      
   }
}
