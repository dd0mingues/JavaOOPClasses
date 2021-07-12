package week7;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] Args) {

		// Using while loops ask a user for their first name and then last name
		// If their first or last name have no character in it then prompt
		// again to enter their first/last name
		// HINT: You two while loops

		// Then tell them their whole name

		System.out.print("Give me your first name: ");
		String fName = getValidName(); // this will run the method that asks for input and checks if it is a valid
										// input (check line 28)

		System.out.print("Give me your last name: ");
		String lName = getValidName(); // run the method again for the last name

		System.out.println("\nHello " + fName + " " + lName);
		
		k.close();
	}

	public static Scanner k = new Scanner(System.in); // creating a method to scan the console

	public static String getValidName() { // get valid name method that asks for a name, checks if it is valid and
											// returns a valid name
		String fName = k.nextLine().trim(); // get a name from user
		if (fName.equals("")) { // if user inputs empty string we set the string to be "0". this is important
								// for the .charAt(0) method
			fName = "0";
		}
		char fNameInitial = fName.toUpperCase().charAt(0); // get char at 0
		while (!((int) fNameInitial >= (int) 'A' && (int) fNameInitial <= (int) 'Z')) { // if the value of that char is
																						// between A and Z it is a valid
																						// input. If it not, it will ask
																						// for another input from the
																						// user.
			System.err.println("Not a valid input!"); // throw error message
			System.out.print("Please enter a valid name: "); // ask for another input
			fName = k.nextLine().trim(); // get input (without the spaces)
			if (fName.equals("")) { // again set empty strings to be "0"
				fName = "0";
			}
			fNameInitial = fName.toUpperCase().charAt(0); // get char at 0 so it can be checked again by the while loop
		}
		return fName = fName.substring(0, 1).toUpperCase() + fName.substring(1).toLowerCase(); // after we get a valid
																								// name we format the
																								// output so the names
																								// come out capitalized.
	}
}
