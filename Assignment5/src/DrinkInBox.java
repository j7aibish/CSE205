// Assignment #: 5
//         Name: Martin Kuna
//	  StudentID: <ID REMOVED>
//		Lecture: <CLASS REMOVED>
//  Description: MISSING

public class DrinkInBox extends Drink {

	private int height, width, depth;

	public DrinkInBox(String ID, double price, int h, int w, int d){
		super(ID, price);
		height = h;
		width = w;
		depth = d;
	}

  	public void computeTotalPrice(){
    		volume = height*width*depth;
		totalPrice = volume*unitPrice;
	}

	public String toString(){
		String a = "\nThe Drink in a Box\n";
		String b = "The Height:\t\t"+height+"\n";
		String c = "The Width:\t\t"+width+"\n";
		String d = "The Depth:\t\t"+depth+"\n";
		return (a+b+c+d)+super.toString();
	}	
}
