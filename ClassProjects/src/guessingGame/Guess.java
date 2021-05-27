package guessingGame;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		
		int number = (int) (Math.random()*100 + 1); //generate random number from 1-100
		int userAnswer=1000; //userAnswer has to be defined for the while statement
		int count = 1;
		
		System.out.println("The correct guess would be: " + number);
		System.out.println("Guess a number up to 100: "); //set of prints to the console
		
		Scanner inputObject = new Scanner(System.in); //define inputObject as a Scanner so it is possible to get input from the console
		
		/* This is not using object oriented programming, the loop bellow is using OOP
		while (userAnswer != number) {
			System.out.println("Incorrect, try again: ");
			userAnswer = inputObject.nextInt();
		}
		
		System.out.println("Correct!");
		*/
		
		while (userAnswer != number) {
			userAnswer = inputObject.nextInt(); //gets input from console
			System.out.println(DetermineNumber.guess(userAnswer, number, count));
			count++;
		}
		
		inputObject.close();
	}
			
}