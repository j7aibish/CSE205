// Assignment #: 5
//         Name: Martin Kuna
//	  StudentID: <ID REMOVED>
//		Lecture: <CLASS REMOVED>
//  Description: MISSING

public class DrinkInCylinder extends Drink {
	
	int radius, height;
	
	public DrinkInCylinder(String ID, double price, int r, int h){
		super(ID, price);
		radius = r;
		height = h;
	}
	
	public void computeTotalPrice(){
		volume = (int) (Math.PI*(radius*radius*height));
		totalPrice = volume*unitPrice;
	}
	
	public String toString(){
		String a = "\nThe Drink in a Cylinder\n";
		String b = "The Radius:\t\t" +radius+ "\n";
		String c = "The Height:\t\t" +height+ "\n";
		return (a+b+c)+super.toString();
	}
}
