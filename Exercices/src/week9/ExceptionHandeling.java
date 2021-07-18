package week9;

import java.util.Scanner;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// Ask the user how many numbers (doubles or ints) they want to input.

		Scanner k = new Scanner(System.in);
		int len = 0;
		while (len == 0 || len == Integer.parseInt("0")) {
			try {
				System.out.print("How many numbers would you like to input: ");
				String userInput = k.nextLine();
				len = Integer.parseInt(userInput);
				if (len < 0) {
					System.out.println("The negative number is being read as a positive number.");
					len = -len;
				}
				break;
			} catch (Exception e) {
				System.out.println("Please enter a valid integer.");
			}
		}
		// Create an array (or an ArrayList) to hold those numbers.
		double[] numbers = new double[len];

		// then ask the user for each number (one by one) and add it the the
		// array/ArrayList
		for (int i = 0; i < numbers.length; i++) {
			while (true) {
				try {
					System.out.print("Enter your number in position " + (i + 1) + ": ");
					String userInput = k.nextLine();
					numbers[i] = Integer.parseInt(userInput);
					break;
				} catch (Exception e) {
					System.out.println("Please enter a valid decimal number.");
				}
			}
		}
		String numberList = "";
		for (double i : numbers) {
			numberList += i + ", ";
		}
		if (len != 0) {
			numberList = numberList.substring(0, numberList.length() - 2);
		}
		System.out.println("Your array is: " + numberList);
		// Then think about the exception that could occur getting the input from the
		// user
		// and then try and write code to handle those exceptions.
		// You may need try/catch and loops to do this.

	}

}
