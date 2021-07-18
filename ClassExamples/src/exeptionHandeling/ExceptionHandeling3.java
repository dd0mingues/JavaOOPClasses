package exeptionHandeling;

import java.util.Scanner;

public class ExceptionHandeling3 {

	public static void main(String[] args) {
		String[] fruits = { "Apple", "Kiwi", "Pear" };

		System.out.println("Pick a fruit:");

		for (int i = 0; i < fruits.length; i++) {
			System.out.println("\t " + i + " " + fruits[i]);
		}

		Scanner k = new Scanner(System.in);

		int attempts = 0;
		while (attempts != 3) {
			System.out.print("Pick a fruit: ");
			try {
				String userInput = k.nextLine(); // .nextInt will loop this forever so we need to get a string and parse
				int choice = Integer.parseInt(userInput);// as an int.

				System.out.println("Here is your " + fruits[choice]);

				break;
			} catch (Exception e) {
				attempts++;
				if (attempts != 3) {
					System.out.println("Check your input and try again.");
					System.out.println("You have " + (3 - attempts) + " remaining.");
				} else {
					System.out.println("You ran out of attempts.");
				}

			}
		}

		k.close();
	}

}
