package taskBPart2;

import java.util.Scanner;

public class FileUtilityExperiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		
		//ask the user for a file name
		System.out.println("You are creating a file, what name would you like to give it?");
		String fileName = k.nextLine();
		
		//ask for a line of text
		//write the text to the file
		boolean continueWriting = true;
		String option = "1";
		
		System.out.println("What would you like to write on the file?");
		String write = k.nextLine();
		FileUtility.WriteTextToFile(fileName, write);
		
		while(continueWriting) {
			
			System.out.println("Would you like to continue writing?");
			System.out.println("1 - Yes");
			System.out.println("2 - No");
			option = k.nextLine();
			
			switch (option) {
			case "1":
				System.out.println("What would you like to write on the file?");
				write = k.nextLine();
				FileUtility.WriteTextToFile(fileName, write);
				break;

			case "2":
				continueWriting = false;
				System.out.println("File is now closed.");
				break;
				
			default:
				System.out.println("Please input a valid number.");
				break;
			}
		}
		
		//show the user the contents of the file
		System.out.println("\nThis is what you wrote:");
		System.out.println(FileUtility.ReadAllTextInFile(fileName));
		
		//how many characters in the file
		System.out.println("You wrote " + FileUtility.CountCharactersInFile(fileName) + " characters.");
		
		k.close();
	}

}
