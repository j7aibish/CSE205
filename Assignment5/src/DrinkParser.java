// Assignment #: 5
//         Name: Martin Kuna
//	  StudentID: <ID REMOVED>
//		Lecture: <CLASS REMOVED>
//  Description: MISSING

import java.util.Scanner;

public class DrinkParser {
	public static Drink parseStringToDrink(String lineToParse){

		Scanner in = new Scanner(lineToParse);

		String[] array = lineToParse.split("/");
		in.close();
		
		if(array[0].equalsIgnoreCase("Cylinder")){
			double price = Double.parseDouble(array[2]);
			int r = Integer.parseInt(array[3]);
			int h = Integer.parseInt(array[4]);

			Drink drink = new DrinkInCylinder(array[1], price, r, h);
			return drink;
		} else {
			double price = Double.parseDouble(array[2]);
			int h = Integer.parseInt(array[3]);
			int w = Integer.parseInt(array[4]);
			int d = Integer.parseInt(array[5]);

			Drink drink = new DrinkInBox(array[1], price, h, w, d);
			return drink;
		}
	}
}
