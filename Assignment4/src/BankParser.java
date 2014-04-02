// Assignment #: 4
//         Name: Martin Kuna
//    StudentID: <ID REMOVED>
//      Lecture: <CLASS REMOVED>
//  Description: BankParser takes a string as input and splits it up into different parts,
//               then calls other methods from another class to store (set) those bits of information
//				       where they belong, after, it returns Bank

import java.util.Scanner;
public class BankParser {

	public static Bank bankParser(String lineToParse){ //start method which has a return type of object bank and takes input of a string
		
	Scanner in = new Scanner(lineToParse).useDelimiter("[/,]"); //initializes the scanner naming it 'in' and inputs the lineToParse, splitting it with delimiters of / or ,
	
	//Creates Strings - bankName/bankID/city,state and initializes them to ?
	String bankName="?";
	String bankID="?";
	String city="?";
	String state="?";

	//Takes each part of the parsed string and puts them into the correct variables
	bankName = in.next();   //first part until it hits / goes here (so the bank name)
	bankID = in.next();     //ID between /xxxx/ goes into bank id
	city = in.next();       //city entered goes into city after ID
	
	while(in.hasNextLine()){ 	//if for some reason they forget to input the state this while loop
	state = in.next();		 	  //checks if there is a next line, if there is, that will be the state
	}						 	            //if there is not then it will move on and use "?" as the state to indicate it is missing
	
	in.close(); //Close the scanner as it is no longer needed.
	
	Bank bnk = new Bank();			      //creates a new bank object named 'bnk' from the class "Bank"
	bnk.setBankName(bankName);		    //calls method setBankName in Bank Class, takes input of variable bankName
	bnk.setBankID(bankID);			      //same thing, calls setBankID and inputs bankID from parsed string above
	bnk.setBankAddress(city, state);  //same thing, calls setBankAddress, takes two string variables as input from above
	
	return bnk; //return bank object
	}
}
