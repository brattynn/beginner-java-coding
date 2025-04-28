//Zybooks - WGU - D286
//Lab 5.17 - Word Frequencies

/*
Write a program that reads a list of words.
Then, the program outputs those words and their frequencies.
The input begins with an integer indicating the number of words that follow.
Assume that the list will always contain fewer than 20 words.

Ex: If the input is:
  5 hey hi Mark hi mark

the output is:
  hey - 1
  hi - 2
  Mark - 1
  hi - 2
  mark - 1

Hint: Use two arrays, one array for the strings and one array for the frequencies.
*/

//STARTING CODE:
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
   }
}



//-------------------------------------------------------------------------------
//MY SOLUTION:
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
      
      Scanner scnr = new Scanner(System.in);    //Scanner to read data input
      
      //Declaring Variables
      final int arrayLimit = scnr.nextInt();
      int i;
      int j;
      
      //Declaring Arrays
      String[] words = new String[arrayLimit];
      int[] frequency = new int[arrayLimit];
      
      //Getting Words into the word array
      for (i = 0; i < words.length; ++i) {
         words[i] = scnr.next();
      }
      
      //Counting the frequencies - need to use a nested For Loop
      for (i = 0; i < arrayLimit; ++i) {        //This outer loop picks one word
         int count = 0;                         //For counting number of same words
         
         for (j = 0; j < arrayLimit; ++j) {     //Compares the picked word to every other word
            if (words[i].equals(words[j])) {    //If the words match... 
               count++;                         //...increment the count.
            }
         }
         
         frequency[i] = count;                  //Save the final count of each word into the frequency array
      }
      
      //Print to output
      for (i = 0; i < arrayLimit; ++i) {
         System.out.println(words[i] + " - " + frequency[i]);
      }
   }
}
