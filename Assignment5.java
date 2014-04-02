// Assignment #: 5
//         Name: Martin Kuna
//	  StudentID: <ID REMOVED>
//		Lecture: <CLASS REMOVED>
//  Description: The Assignment 5 class displays a menu of choices
//               (add a drink, compute their total price, search a drink, list drinks,
//               quit, display menu) to a user.
//               Then it performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.util.*;       //to use ArrayList

public class Assignment5
 {
  public static void main (String[] args)
   {
     char input1;
     String inputInfo = new String();
     String line = new String();
     boolean found = false;

     // ArrayList object is used to store drink objects
     ArrayList drinkList = new ArrayList();
     printMenu();     // print out menu

     // create a Scanner object to read from a keyboard
     Scanner scan = new Scanner(System.in);

     do
     {
         System.out.println("What action would you like to perform?");
         line = scan.nextLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {
           switch (input1)
            {
             case 'A':   //Add Drink
               System.out.print("Please enter a drink information to add:\n");
               inputInfo = scan.nextLine().trim();
               //calls drinkList array, passes parse method with input info, adding it to the drink list array
               drinkList.add(DrinkParser.parseStringToDrink(inputInfo));
               break;
             case 'C':   //Compute Total Prices
            	 //iterating over the size of the drinkList array, and computing for each individual drink
            	 for (int i=0; i<drinkList.size();i++){
            		 ((Drink) drinkList.get(i)).computeTotalPrice();
            	 } //after it reaches the end of the list, it ends the loop, and prints 'total prices computed'
               System.out.print("total prices computed\n");
               break;
             case 'D':   //Search for Drink
               System.out.print("Please enter a drinkID to search:\n");
               inputInfo = scan.nextLine().trim();
               //iterates over the size/length of drinkList array, and checks to see if the input matches any of the drink's ID's
               for (int i=0; i<drinkList.size();i++){
            	   if (inputInfo.equals(((Drink)drinkList.get(i)).getDrinkId())) //if it finds that the ID matches inputInfo
                    found = true; //we set found to true
                   }
               if (found == true) //if found is true, we print 'drink found'
            	   System.out.print("drink found\n");
               else	//otherwise 'drink is not found'
            	   System.out.print("drink not found\n");
               found=false; //after printing if it's found or not, we reset the variable found to false, otherwise it may say found, when that is not true
               break;
             case 'L':   //List Drinks
            	 if (drinkList.isEmpty()) //if there are no drinks in the drinkList array, we print 'no drink'
            		 System.out.print("no drink\n");
            	 else //otherwise, if it is NOT empty, we iterate over the size/length of drinkList array, calling toString on each item in the array
            		 for (int i=0; i < drinkList.size(); i++)
                       System.out.print(drinkList.get(i).toString());
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
        } while (input1 != 'Q'); // stop the loop when Q is read

     scan.close(); //I LIKE TO CLOSE SCANNERS - MARTIN
  }

  /** The method printMenu displays the menu to a use **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd Drink\n" +
                      "C\t\tCompute Total Prices\n" +
                      "D\t\tSearch for Drink\n" +
                      "L\t\tList Drinks\n" +
                      "Q\t\tQuit\n" +
                      "?\t\tDisplay Help\n\n");
  }
}
