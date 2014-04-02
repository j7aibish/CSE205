// Assignment #: 4
//         Name: Martin Kuna
//    StudentID: <ID REMOVED>
//      Lecture: <CLASS REMOVED>
// Description: Assignment 4 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//      enter the next choice until the choice of 'Q' (Quit) is entered.

import java.io.*;
import java.util.*;

public class Assignment4
{
  public static void main (String[] args)
  { // local variables, can be accessed anywhere from the main method
      char input1;
      String inputInfo = new String();
      String line = new String(), line2;
      //instantiate a Bank array
      Bank[] accounts = new Bank[10];
      Bank bank1 = null;

      Scanner scan = new Scanner(System.in);
      int index = 0;
      // print the menu
       printMenu();
       do  // will ask for user input
        {
         System.out.println("What action would you like to perform?");
         line = scan.nextLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {// matches one of the case statements
           switch (input1)
            {
             case 'A':   //Add Bank
               System.out.print("Please enter the bank information:\n");
               inputInfo = scan.nextLine();
               bank1 = BankParser.bankParser(inputInfo);
               accounts[index] = bank1;
               index++;
               break;
             case 'B':   //Display banks
               for (int i=0; i< index; i++)
               			System.out.print(accounts[i].toString());
               break;
             case 'Q':   //Quit
               break;
             case '?':   //Display Menu
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
          }
         else
          {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q' || line.length() != 1);
      }


  /** The method printMenu displays the menu to a user**/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                        "------\t\t------\n" +
                        "A\t\tAdd Bank\n" +
                        "B\t\tDisplay Banks\n" +
                        "Q\t\tQuit\n" +
                        "?\t\tDisplay Help\n\n");
  }
}
