// Assignment #: 1
//         Name: Martin Kuna
//    StudentID: <ID REMOVED>
//      Lecture: <CLASS REMOVED>
//  Description: This class reads an integer from a keyboard and prints it out
//               along with other messages.

import java.util.Scanner;  // use the Scanner class located in the "java.util" directory

public class Assignment1 {  // start of class

  public static void main (String[] args) {  // start of main method

    int number;  // creates a new integer variable called number

    Scanner console = new Scanner(System.in);  // constructs a new scanner called console

    number = console.nextInt();  // read an integer entered by a user

    // display the number with other messages
    System.out.print("This program reads an integer from a keyboard,\n"
                   + "and prints it out on the display screen.\n"
                   + "The number is " + number + ".\n"
                   + "Make sure that you get the exact same output as the expected one.\n");

    console.close();	// closes the scanner console
   
  }  // end of main method
}  // end of class
