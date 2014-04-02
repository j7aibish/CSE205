// Assignment #: 2
//         Name: Martin Kuna
//    StudentID: <ID REMOVED>
//      Lecture: <CLASS REMOVED>
//  Description: This class reads an integer (or double) from a keyboard and prints it out
//               along with other messages.

import java.util.Scanner;  //Import scanner to get keyboard input

public class Assignment2 {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);  //creates a new scanner object named in
		int count = 0;	//create new integer named count and initializes it to 0, will be used to keep track of how many numbers the user enters.
		boolean endLoop = false;	//creates a boolean variable named endLoop and initializes it to default to false
		double [] array = new double[100];	//creates an array with a size of 100, as per the instructions of the assignment saying to be able to handle up to 100 numbers.

		for(int i=0; endLoop!=true; i++){	//iterates so long as endLoop is not true
			array[i]= in.nextDouble();	//takes user input into the Scanner object 'in' and stores each next double in the i index of the array

			if(array[i]!=0){	//every time a value that is not zero is added to the array
				count++;	//we increase count by 1.
			} else {
				endLoop=true; //otherwise, we get out of the loop by setting endLoop to true
			}
		}
		in.close();  //Closes the scanner object, as it is no longer needed.

		System.out.printf("The minimum number is "+"%.0f", findMin(array,count));  //prints and formats the minimum value of array using findMin
		System.out.printf("\nThe sum of the positive numbers is $"+"%.2f",computePositiveSum(array,count));  //prints and formats sum of positive numbers using computerPositiveSum
		System.out.println("\nThe total number of negative numbers is "+countNegative(array,count));  //prints number of negative array values using countNegative

	} //end of main method

	//findMin takes an array, and array length, then finds the lowest/minimum value in array
	public static double findMin(double[] numbers, int count){ //count is the count of numbers stored in the array
		double min = numbers[0];  //stores array index 0's value in variable min (as a starting value for our 'for' loop

		for(int i=0;i<count;i++){		//for loop, iterating until i is less than count(count: number of index's in array, excludes zero)
			if(numbers[i]<min){		//tests to see if value in the preceding is less than the subsequent number
				min = numbers[i];	//if it is, the subsequent value is the new minimum, and is stored in min
			}
		}
		return min; //return minimum number in the array as a double
	}

	//computePositiveSum takes an array and array length, then adds up all the positive values
	public static double computePositiveSum(double[] numbers, int count){
		double sum=0;	//initializes variable sum to zero

		for(int i=0;i<count;i++){		//iterates until i is less than count
			if(numbers[i]>0){		//if number in the i index of the array is greater than zero
				sum += numbers[i];	//then add it to the running tally/total value named sum
			}
		}
		return sum;  //return the sum as a double
	}

	//countNegative takes an array and array length, then tallys up how many negative numbers there are
	public static int countNegative(double[] numbers, int count){
		int negCount=0;  //creates an integer negCount, initializing it to zero, because of there are no negative numbers, we must return 0

		for(int i=0;i<count;i++){	//iterates until i is less than count
			if(numbers[i]<0){	//if number at index i is less than 0
				negCount++;	//we add 1 to the running tally or count, because it is negative
			}
		}
		return negCount;  //returns how many negative values are in the array as an int
	}

}
