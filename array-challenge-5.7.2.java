//Zybooks - WGU - D286
//Copy and modify array elements.
/*
Write a loop that sets newScores to oldScores rotated once left, with element 0 copied to the end.
Ex: If oldScores = {10, 20, 30, 40}, then newScores = {20, 30, 40, 10}. 
*/

//STARTING CODE:
import java.util.Scanner;
public class StudentScores {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] oldScores = new int[SCORES_SIZE];
      int[] newScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < oldScores.length; ++i) {
         oldScores[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
     

      for (i = 0; i < newScores.length; ++i) {
         System.out.print(newScores[i] + " ");
      }
      System.out.println();

//--------------------------------------------------------------------------------------------
//MY SOLUTION:
import java.util.Scanner;
public class StudentScores {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] oldScores = new int[SCORES_SIZE];
      int[] newScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < oldScores.length; ++i) {
         oldScores[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
      for (i = 0; i < newScores.length - 1; ++i) {//-1 just to fill the first 3 indexes (0, 1, 2)
         newScores[i] = oldScores[i + 1];
      }
     
      newScores[newScores.length - 1] = oldScores[0]; //Takes the first index of oldScores and places it in the last position of newScores

      for (i = 0; i < newScores.length; ++i) {
         System.out.print(newScores[i] + " ");
      }
      System.out.println();
