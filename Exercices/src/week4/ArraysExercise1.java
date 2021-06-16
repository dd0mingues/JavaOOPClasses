package week4;

import java.util.Scanner;

public class ArraysExercise1 {
	public static void main(String[] args) {

		// Ask the user how many numbers they want to enter	
		System.out.println("How many numbers do you want to input?"); //print to console what we want from user
		Scanner keyboard = new Scanner(System.in); //initialize scanner
		int arrayLenght = keyboard.nextInt();	//get the number from the user

		// Allow the user to enter the number which will be saved in an array	
		double[] listNumbers = new double[arrayLenght]; // set array length to given number
		for (int i = 0; i < arrayLenght; i++) {	//for loop up to the given value given by the user
			System.out.println("What number would you like to input at index " + i + " ?"); //ask what number user wants to insert in the array
			listNumbers[i] = keyboard.nextDouble(); // get number that he input
		}//close the for loop

		// Then show the user all of the numbers they enters
		System.out.println("\nHere is the list you created:"); // output to console the text
		for(double numbers : listNumbers) {	//for loop through the list of numbers
			System.out.println(numbers); //print out these numbers to the console
		} //close the for loop
		
		// Show the user the sum of those numbers		
		double sum = 0; //initialize sum variable
		for(double numbers : listNumbers) { //for loop through the list of numbers
			sum += numbers; //add the current number to the current sum value
		} //close the for loop
		System.out.println("\nThe numbers you input sum up to " + sum); //output to the console the value of the sum
		

		// NOTE: Put comments is your code to explain what your code is doing

		
		keyboard.close(); //close scanner to avoid memory leaks
	}
} // end of main