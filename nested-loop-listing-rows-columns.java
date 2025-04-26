/*
Given numRows and numColumns, print a list of all seats in a theater. Rows are numbered, columns lettered, as in 1A or 3E.
Print a space after each seat, including after the last.
Use separate print statements to print the row and column.
Ex: numRows = 2 and numColumns = 3 prints: 1A 1B 1C 2A 2B 2C 
*/

//INITIAL STARTING CODE:
public class NestedLoops {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      /* Your solution goes here  */

      System.out.println("");
   }
}

//---------------------------------------------------------
//MY COMPLETED CODE:
import java.util.Scanner;
public class NestedLoops {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      int currentColumn;
      char currentColumnLetter;

      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();
      currentColumnLetter = 'a';

      for (currentRow = 1; currentRow <= numRows; ++currentRow) {
         for (currentColumn = 0; currentColumn < numColumns; ++currentColumn) {
            currentColumnLetter = (char)('A' + currentColumn);                   //Casting (char) turns a number into a character.
            System.out.print(currentRow + "" + currentColumnLetter + " ");
         }
      }  

      System.out.println("");
   }
}
