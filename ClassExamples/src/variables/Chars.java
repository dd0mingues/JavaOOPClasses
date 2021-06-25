package variables;

import java.util.Scanner;

public class Chars {

	public static void main(String[] args) {
		char A1 = 'A';
		char A2 = 65; //unicode value for A
		
		System.out.println(A1 + " " + A2);
		
		for(int i=0; i<60; i++) {
			System.out.print(A1 + " ");
			A1++;
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter an animal");
		String userInput = s.next();
		
		char firstChar = userInput.charAt(0);
		System.out.println("The first char in your input is: " + firstChar);
		System.out.println("The unicode decimal value of that char is " + (int)firstChar);
		
		s.close();

	}

}
