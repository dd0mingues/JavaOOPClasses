package taskBPart2;

public class TestFileMethods {

	public static void main(String[] args) {
		
		// filename for testing WITHOUT any extension
		String filename = "javafiletest";

		// Write the text the file which will be saved in the 'c:\TASKBPART2FILES' directory
		FileUtility.WriteTextToFile(filename, "Mary had a little lamb.");

		// Read all the text in the file as a string and write to the console
		System.out.println(FileUtility.ReadAllTextInFile(filename));

		// Count all the characters in the file and write to the console
		System.out.println(FileUtility.CountCharactersInFile(filename));		

	}

}
