package week3;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		
		//constructs a new scanner called keyboard to read inputs from the console
		Scanner keyboard = new Scanner(System.in); 
		
		//defining all the variables preemptively. I found out you can declare same type variables in the same line.
		String firstName, lastName, location, operatorChoice;
		double numberDecimal;
		int numberInt, thresholdNumber = 30;
		
		//1st set of questions and inputs. each question is followed by a prompt to the user
		System.out.println("Hello, what's your first name?");
		firstName = keyboard.nextLine();
		System.out.println("What's your last name?");
		lastName = keyboard.nextLine();
		System.out.println("Where do you live?");
		location = keyboard.nextLine();
		System.out.println("Hello " + firstName + " " + lastName 
				+ " from " + location + ".");
		
		
		System.out.println("Give me a decimal number!");
		numberDecimal = keyboard.nextDouble();
		
		//I defined thresholdNumber because its good practice to define everything in case we need it to change later.
		//Notice thresholdNumber is used multiple times in the code. In this examples it is set to 30 but,
		//if we need to change it to another value we can just go the the variables and change it once
		if (numberDecimal < thresholdNumber) {
			System.out.println(numberDecimal + " is lower than " + thresholdNumber + "!");
		}
		else if (numberDecimal == thresholdNumber) {
			System.out.println("Both your number are the same!");
		}
		else {
			System.out.println(numberDecimal + " is higher than " + thresholdNumber + "!");
		}
		
		System.out.println("Give me a whole number!");
		numberInt = keyboard.nextInt();
		
		System.out.println("Would you like to add, divide or multiply these two numbers  by " + numberInt + "? (Type a, d or m and press ENTER)");
		
		operatorChoice = keyboard.nextLine();
		
		
		//we only want to accept a, d or m as an input, this checks if the user did input any of these
		//if not it will keep asking until the user inputs one of the predefined values
		while (!(operatorChoice.equals("a") || operatorChoice.equals("d") || operatorChoice.equals("m"))) {
			System.out.println("Please input either 'a', 'd' or 'm'," + "for addition, division and multiplication, respectively");
			operatorChoice = keyboard.nextLine();
		}
		
		
		//simple set of if statements to output the right answer
		if (operatorChoice.equals("a")) {
			System.out.println(numberDecimal + " + " + numberInt +
					" = " + (numberDecimal+numberInt));
		}
		
		if (operatorChoice.equals("d")) {
			System.out.println(numberDecimal + " / " + numberInt +
					" = " + (numberDecimal/numberInt));
		}
		
		if (operatorChoice.equals("m")) {
			System.out.println(numberDecimal + " * " + numberInt +
					" = " + (numberDecimal*numberInt));
		}
		
		
		//closes the scanner.
		keyboard.close();
		
	}

}
