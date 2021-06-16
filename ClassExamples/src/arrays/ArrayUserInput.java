package arrays;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("How many names do you want to input?");
		int arrayLenght = keyboard.nextInt();

		// bcs in java array length is fixed we need to created an array before hand
		// with the desired length
		String[] listNames = new String[arrayLenght];

		// get names to fill the list up to the selected array length
		for (int i = 0; i < arrayLenght; i++) {
			System.out.println("What name would you like to input at index " + i + " ?");
			listNames[i] = keyboard.next();
		}

		// line break
		System.out.println("");

		// show full list
		for (String names : listNames) {
			System.out.println(names);
		}

		keyboard.close();
	}

}
