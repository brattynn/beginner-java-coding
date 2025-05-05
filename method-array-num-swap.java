//WGU - D286 - Zybook
//CHallenge 6.10.2

//QUESTION:
/*
Write a method swapArrayEnds() that swaps the first and last elements of its array parameter. 
Ex: sortArray = {10, 20, 30, 40} becomes {40, 20, 30, 10}. 
*/

//STARTING CODE:
import java.util.Scanner;

public class ModifyArray {

   /* Your solution goes here  */
   
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numElem = 4;
      int[] sortArray = new int[numElem];
      int i;
      int userNum;

      for (i = 0; i < sortArray.length; ++i) {
         sortArray[i] = scnr.nextInt();
      }

      swapArrayEnds(sortArray);

      for (i = 0; i < sortArray.length; ++i) {
         System.out.print(sortArray[i]);
         System.out.print(" ");
      }
      System.out.println("");
   }
}


//----------------------------------------------------------------------------
//MY SOLUTION:
import java.util.Scanner;

public class ModifyArray {

   /* Your solution goes here  */
   public static void swapArrayEnds(int[] swap) {
      int swapIndex0 = 0;
      int swapLastIndex = swap.length - 1;   //This will get the index number of the last value.
      int tempVal = swap[swapIndex0];
      
      swap[swapIndex0] = swap[swapLastIndex];
      swap[swapLastIndex] = tempVal;
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numElem = 4;
      int[] sortArray = new int[numElem];
      int i;
      int userNum;

      for (i = 0; i < sortArray.length; ++i) {
         sortArray[i] = scnr.nextInt();
      }

      swapArrayEnds(sortArray);

      for (i = 0; i < sortArray.length; ++i) {
         System.out.print(sortArray[i]);
         System.out.print(" ");
      }
      System.out.println("");
   }
}
