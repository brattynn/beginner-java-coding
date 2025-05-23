//Zybook Challenge 5.4.5 - WGU - D286 Java Fundamentals
//Printing array elements separated by commas:

/*
Write a for loop to print all NUM_VALS elements of array hourlyTemp.
Separate elements with a comma and space.
Ex: If hourlyTemp = {90, 92, 94, 95}, print:

90, 92, 94, 95

Your code's output should end with the last element, without a subsequent comma, space, or newline. 
*/

//STARTING CODE:
import java.util.Scanner;

public class PrintWithComma {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int[] hourlyTemp = new int[NUM_VALS];
      int i;

      for (i = 0; i < hourlyTemp.length; ++i) {
         hourlyTemp[i] = scnr.nextInt();
      }

      /* Your solution goes here  */

      System.out.println("");
   }
}

//----------------------------------------------------
//MY SOLUTION:
import java.util.Scanner;

public class PrintWithComma {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int[] hourlyTemp = new int[NUM_VALS];
      int i;

      for (i = 0; i < hourlyTemp.length; ++i) {
         hourlyTemp[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
      for (i = 0; i < hourlyTemp.length; ++i) {
         System.out.print(hourlyTemp[i]);
         if (i < 3) {
            System.out.print(", ");
         }
      }

      System.out.println("");
   }
}
