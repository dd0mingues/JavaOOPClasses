package offerTea;

import java.util.Scanner;

public class OfferTea {

	public static void main(String[] args) {
		
		//initialize variables and classes
		Scanner keyboard = new Scanner(System.in); //we are going to get input so we need a scanner class
		int count = 0;
		String answer = "no"; // have to initialize answer here to be able to get the restriction in the while loop
		
		System.out.println("Would you like a cup of tea? (yes/no)"); //Initial prompt
		
		while(answer.startsWith("n") && count < 5) {
			answer=keyboard.nextLine().toLowerCase(); //request user input .toLowerCase is used so if user inputs upper case it will be set as lower case
			System.out.println(UserInput.userInput(answer, count)); //prints the result from the UserInput class
			count++;
		}
		
		keyboard.close(); //closes the scanner 
	}

}