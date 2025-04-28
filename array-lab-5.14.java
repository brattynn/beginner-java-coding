//Zybooks - WGU - D286
//5.14 Lab - Middle Item

/*
Given a sorted list of integers, output the middle integer.
A negative number indicates the end of the input (the negative number is not a part of the sorted list).
Assume the number of integers is always odd.

Ex: If the input is:

2 3 4 8 11 -1 

the output is:

Middle item: 4

The maximum number of list values for any test case should not exceed 9.
If exceeded, output "Too many numbers".

Hint: First read the data into an array. Then, based on the array's size, find the middle item.
*/

//STARTING CODE:
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user      

      /* Type your code here. */
     
   }
}


//------------------------------------------------------------------------------------------------
//MY SOLUTION:
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[9];  // Set of data specified by the user      

      /* Type your code here. */
      int numElements = 0;                            //How many numbers the user entered
      int inputValue;
      int middleIndex;
      
      //Read numbers into the array
      inputValue = scnr.nextInt();                    //Reads first Number
      while (inputValue >= 0) {
         if (numElements >= 9) {                       //Check for too many numbers
            System.out.println("Too many numbers");
            return;
         }
         
         userValues[numElements] = inputValue;        //Store value in the right spot
         numElements++;                               //Add 1 to numElements to increase the index.
         inputValue = scnr.nextInt();                 //Read next number
      }
      
      //Finding and printing the Middle Index
      middleIndex = numElements / 2;
      System.out.println("Middle item: " + userValues[middleIndex]);
   }
}
