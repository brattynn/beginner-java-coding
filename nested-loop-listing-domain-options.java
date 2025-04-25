
/*
Modify the program to include two-character .com names where the second character can be a letter
or a number, as in a2.com. Hint: Add a second loop, following the while (letter2 <= 'z')
loop, to handle numbers.
*/

//STARTING PROGRAM --------------------------------------------

import java.util.Scanner;

public class DomainNamePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      char letter1;
      char letter2;

      System.out.println("Two-letter domain names:");

      letter1 = 'a';
      while (letter1 <= 'z') {
         letter2 = 'a';
         while (letter2 <= 'z') {
            System.out.println("" + letter1 + 
                               "" + letter2 + ".com");
            ++letter2;
         }
         ++letter1;
      }
   }
}


//MY PROGRAM --------------------------------------------------

import java.util.Scanner;

public class DomainNamePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      char  letter1;
      char  letter2;
      int   letterNum;

      System.out.println("Two-letter domain names:");

      letter1 = 'a';
      while (letter1 <= 'z') {
         letter2 = 'a';
         while (letter2 <= 'z') {
            System.out.println("" + letter1 + 
                               "" + letter2 + ".com");
            ++letter2;
         }
         
         letterNum = 0;
         while (letterNum <= 9) {
            System.out.println("" + letter1 + letterNum + ".com");
            ++letterNum;
         }
         
         ++letter1;
      }
   }
}
