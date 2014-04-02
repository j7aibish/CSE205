// Assignment #: 4
//         Name: Martin Kuna
//    StudentID: <ID REMOVED>
//      Lecture: <CLASS REMOVED>
//  Description: This class has methods for setting/getting bank name/ID as well as, using
//				 other classes to bring all information into one place in order to
//               return the full bank info in a full string using the overriding toString method

public class Bank {

	//instance variables
	private String bankName;
	private String bankID;
	private Address bankAddress;
	
	//constructor that initializes instance variables to "?" and creates a new address object
	public Bank(){
		bankName = "?";
		bankID = "?";
		bankAddress = new Address();
	}
	
	//simple method, returns variable bankName
	public String getBankName(){
		return bankName;
	}
	
	//returns variable bankID
	public String getBankID(){
		return bankID;
	}
	
	//returns bankAddress
	public Address getBankAdress(){
		return bankAddress;
	}
	
	//takes a string as input then sets it as the bank name
	public void setBankName(String bankName){
		this.bankName = bankName;
	}
	
	//takes a string as input then sets it as the bankID
	public void setBankID(String bankID){
		this.bankID = bankID;
	}
	
  //takes two strings as input
	public void setBankAddress(String city, String state){
		bankAddress.setCity(city);   //calls address class's method setCity and passes first string into it
		bankAddress.setState(state); //calls address class's method setState and passes second string into it
	}
	
	//this is an overriding toString method that returns a single string will all bank information
	public String toString(){
		String one = ("\nBank name:\t\t"+getBankName()+"\n");
		String two = ("Bank ID:\t\t"+getBankID()+"\n");
		String three = ("Bank address:\t\t"+getBankAdress()+"\n\n");
		String output = one+two+three; //takes above 3 strings and puts them in one

		return output; //returns
	}
}
