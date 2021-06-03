package week1;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		String firstName, lastName, location, operatorChoice;
		double numberDecimal;
		int numberInt, thresholdNumber = 30;
		
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
		
		

		if (numberDecimal < thresholdNumber) {
			System.out.println(numberDecimal + " is lower than "
					+ thresholdNumber + "!");
		}
		else System.out.println(numberDecimal + " is higher than "
				+ thresholdNumber + "!");
		
		
		System.out.println("Give me a whole number!");
		numberInt = keyboard.nextInt();
		
		System.out.println("Would you like to add, divide or multiply these two numbers  by " 
				+ numberInt + "? (Type a, d or m and press ENTER)");
		
		operatorChoice = keyboard.next();
		
		
		while (!(operatorChoice.equals("a") || operatorChoice.equals("d") || operatorChoice.equals("m"))) {
			System.out.println("Please input either 'a', 'd' or 'm'," + "for addition, division and multiplication, respectively");
			operatorChoice = keyboard.next();
		}
		
		
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
		
		
		keyboard.close();
		
	}

}
