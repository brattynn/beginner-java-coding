/*
"Simon Says" is a memory game where "Simon" outputs a sequence of 10 characters (R, G, B, Y) and the user must repeat the sequence.
Create a for loop that compares the two strings starting from index 0.
For each match, add one point to userScore.
Upon a mismatch, exit the loop using a break statement.
Assume simonPattern and userPattern are always the same length.
Ex: The following patterns yield a userScore of 4:

simonPattern: RRGBRYYBGY
userPattern:  RRGBBRYBGY
*/

//STARTING CODE:
import java.util.Scanner;

public class SimonSays {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String simonPattern;
      String userPattern;
      int userScore;
      int i;

      userScore = 0;

      simonPattern = scnr.next();
      userPattern  = scnr.next();

      /* Your solution goes here  */

      System.out.println("userScore: " + userScore);

      return;
   }
}

//-------------------------------------------------------------------------------------------------------------------
//MY SOLUTION:
import java.util.Scanner;

public class SimonSays {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String simonPattern;
      String userPattern;
      int userScore;
      int i;

      userScore = 0;

      simonPattern = scnr.next();
      userPattern  = scnr.next();

      for (i = 0; i < simonPattern.length(); ++i) { //Start the loop from zero.
         if (simonPattern.charAt(i) == userPattern.charAt(i)) { //Check to see if letters/values are the same.
            userScore = userScore + 1; //Update the score
         }
         else {
            break;
         }
      }

      System.out.println("userScore: " + userScore);

      return;
   }
}
