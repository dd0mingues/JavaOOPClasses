package exeptionHandeling;

import java.util.Scanner;

public class ExcetionHandeling2 {

	public static void main(String[] args) {

		String[] fruits = { "Apple", "Kiwi", "Pear" };

		System.out.println("Pick a fruit:");

		for (int i = 0; i < fruits.length; i++) {
			System.out.println("\t " + i + " " + fruits[i]);
		}

		System.out.print("Pick a fruit: ");
		Scanner k = new Scanner(System.in);

		try {
			int choice = k.nextInt();
			System.out.println("Here is your " + fruits[choice]);
		} catch (java.util.InputMismatchException im) {
			System.out.println("Invalid input!");
		}catch(ArrayIndexOutOfBoundsException ob) {
			System.out.println("Out of boudnds!");
		}catch(Exception e) {
			System.out.println("Unknown error.");
		}
		
		k.close();
	}

}
