package week4;

import java.util.Scanner;

public class SubstringExercice1 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your name? (First and Last)");
		String inputName = keyboard.nextLine();

		while (inputName.indexOf(" ") == -1) {
			System.out.print("Please input a valid name ('firstName lastName'): ");
			inputName = keyboard.nextLine();
		}
		String firstName = inputName.substring(0, inputName.indexOf(" "));
		String lastName = inputName.substring(inputName.indexOf(" ")+1);
		
		System.out.println("Your first name is:\t" + capitalize(firstName) + "\nYour last name is:\t" + capitalize(lastName));

		keyboard.close();

	}

	public static String capitalize(String word) { //method to capitalize words	
		String capitalizedWord = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
		return capitalizedWord;
		
	}
	
}
