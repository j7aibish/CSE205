// Assignment #: 5
//         Name: Martin Kuna
//	  StudentID: <ID REMOVED>
//		Lecture: <CLASS REMOVED>
//  Description: MISSING

import java.text.*;
public abstract class Drink {
	
	protected int volume;
	protected double unitPrice, totalPrice;
	protected String drinkId;
	
	public Drink(String ID, double price){
		volume = 0;
		unitPrice = price;
		totalPrice = 0.0;
		drinkId = ID;
	}
	
	public String getDrinkId() {
		return drinkId;
	}
	
	public abstract void computeTotalPrice();

	
	public String toString(){
		NumberFormat nFu = new DecimalFormat("###,##0.00##");
		NumberFormat nFt = new DecimalFormat("$###,##0.00");
		String a = "The DrinkId:\t\t" + getDrinkId() + "\n";
		String b = "The Volume:\t\t" +volume+ "\n";
		String c = "The Unit Price:\t\t" +nFu.format(unitPrice)+ "\n";
		String d = "The Total Price:\t" + nFt.format(totalPrice)+ "\n\n";
		return (a+b+c+d);
	}
}
