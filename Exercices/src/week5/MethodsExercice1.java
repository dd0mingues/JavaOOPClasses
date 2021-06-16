package week5;

import java.util.Scanner;

public class MethodsExercice1 {
	public static void main(String[] args) {
		// demo the methods in use
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your first name?  ");
		String fName = keyboard.next();
		System.out.print("What is your last name?\t  ");
		String lName = keyboard.next();
		System.out.println("Your initials are: " + initials(fName,lName));
		
		
		System.out.println("\nGive me two different numbers");
		double num1 = keyboard.nextDouble();
		double num2 = keyboard.nextDouble();
		System.out.println("Out of the two, the biggest number is " + biggestNumber(num1, num2));
		
		keyboard.close();
	}
	// make a method to take in two strings and return
	// the first character of each string concatenated as a single string
	// example: "Jim","Smith" -> "JS"
	public static String initials(String fName, String lName) {
		return ("" + fName.charAt(0) + lName.charAt(0)).toUpperCase();
	}
	
	// make a method to return two numbers and return the largest
	// of the two numbers
	public static double biggestNumber(double num1, double num2) {
		if(num1 == num2)
			return -99;
		else if(num1 > num2)
			return num1;
		else
			return num2;
	}


}
