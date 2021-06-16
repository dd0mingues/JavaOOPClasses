package strings;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		
		String mary = "Mary Had A Little Lamb";
		String maryUpper = mary.toUpperCase();
		
		System.out.println(mary);
		System.out.println(maryUpper);
		
		int indexOfA = mary.indexOf("A");
		int indexOfa = mary.indexOf("a"); //also works with more than one character
		System.out.println("\nThe first a it at #" + indexOfa + " and the first A is at #" +  indexOfA);
		
		
		//Check if the input has a certain character
		System.out.print("\nGive me a word or sentence: ");
		Scanner keyboard = new Scanner(System.in);
		String inputString = keyboard.nextLine();
		
		int indexOfz = inputString.toLowerCase().indexOf("z"); //returns -1 if there is no z/Z in the string
		if ( indexOfz == -1 ) 
			System.out.println("There is no 'z' in the string");
		else 
			System.out.println("There is 'z' at " + indexOfz);
		
		
		//LINE BREAK
		System.out.println("");
		
		System.out.println(mary.substring(5)); //with only one value, we get the string from the value to the end
		System.out.println(mary.substring(5,mary.indexOf("Lamb")));
		
		
		keyboard.close();
	}
}
