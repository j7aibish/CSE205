// Assignment #: 4
//         Name: Martin Kuna
//    StudentID: <ID REMOVED>
//      Lecture: <CLASS REMOVED>
//  Description: This class has methods for setting/getting bank address as well as,
//               returning the address in a full string using the overriding toString method

public class Address {
	//instance variables
	private String acity;
	private String astate;
	
	//constructor initializing variables to "?"
	public Address(){
		acity = "?";
		astate = "?";
	}
	
	//return method which returns the city when called
	public String getCity(){
		return acity;
	}
	
	//method with return type string, that returns state when called
	public String getState(){
		return astate;
	}
	
	//method that takes a string for input then sets it as the city
	public void setCity(String city){
		acity = city;
	}
	
	//method that takes a string for input then sets it as the state
	public void setState(String state){
		astate = state; //I could have used this.state = state; instead to refer to the instance variable, however, I choose not to
	}
	
	//overriding toString method that returns the string address
	public String toString(){
		//String address = "?,?";
		String address = acity.concat(","+astate); //takes strings city and state, joins the strings with comma between them
		return address;	//returns new string
	}
}
