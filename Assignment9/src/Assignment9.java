//
// MARTIN A. KUNA
//
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment9 {

	public static void main(String [] args) throws IOException {
		
		double[] array = new double[100];
		double input;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		do{
			String readLine = reader.readLine();
			input = Double.parseDouble(readLine);
			array[i] = input;
			i++;
		} while ( input != 0 ); // while input is anything but 0.

		DecimalFormat fmt = new DecimalFormat("0.##");
		
		System.out.println("The maximum number is "+fmt.format(findMax(array, 0)));
		System.out.println("The total number of negative numbers is "+countNegative(array, 0));
		System.out.println("The sum of positive numbers is "+fmt.format(computeSumPositive(array, 0)));
	}

	public static double findMax(double[]a, int i){ //not yet working
		if(i == a.length) return 0;
		double max=a[i];
		return (a[i] > max ? 1 : 0) + findMax(a, i+1);
	}
	
	public static int countNegative(double[]a,int i){
		if(i == a.length) return 0;
	    return (a[i] < 0 ? 1 : 0) + countNegative(a, i+1);
	}
	
	public static double computeSumPositive(double[]a, int i) {
		if(i == a.length) return 0;
		return (a[i] > 0 ? a[i] : 0) + computeSumPositive(a, i+1);
	}
}
//
//MARTIN A. KUNA
//
