package taskBPart2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class FileUtility {

	// 'ReadAllTextInFile' reads all the text in a given file name
    // that exist within the directory c:\TASKBPART2FILES and returns the text as a string.
    // The parameter 'filename' - is the name of the file WITHOUT any extension e.g. "file1"
    // 'ReadAllTextInFile' checks to see if the directory and file exists.
    // You do not need create the directory as the 'WriteTextToFile' method will
    // create the directory if necessary.
	public static String ReadAllTextInFile(String filename) { 
		File directory = new File("c:\\TASKBPART2FILES");
		File file;
		if (filename.isEmpty() || filename == null) {
			System.out.println("Could not read file. No file name was provided!");
		} else {
			if (!directory.exists()) {
				System.out.println("The directory c:\\TASKBPART2FILES does not exist");
			} else {
				file = new File(directory.toString() + "\\" + filename + ".txt");
				Path path = Paths.get(file.getPath());
				if (!file.exists()) {
					System.out.println("The file " + filename + ".txt does not exist in the directory c:\\TASKBPART2FILES");
				} else {
					try {
						return new String(Files.readAllBytes(path));
					} catch (IOException e) {
						System.out.println("An error occurred while trying to read the file.");
							
					}
				}
			}
		}
		return null;

	}

	// 'WriteTextToFile' - Writes a text file to the directory 'c:\TASKBPART2FILES'
    // The parameter 'filename' -  is the name of the file WITHOUT any extension e.g. "file1"
    // You do not need to create the directory as the 'WriteTextToFile' method will
    // create the directory 'c:\TASKBPART2FILES' if necessary.
    // If the file name already exists then the text is added/appended to the existing file.
	public static void WriteTextToFile(String filename, String text) {
		File directory = new File("c:\\TASKBPART2FILES");
		File file = null;

		if (filename.isEmpty() || filename == null) {
			System.out.println("Could not read file. No file name was provided!");
		} else {
			if (!directory.exists()) {
				directory.mkdir();
			}

			file = new File(directory.toString() + "\\" + filename + ".txt");

			try {
				PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file.getPath(), true)));
				writer.println(text);
				writer.close();
			} catch (IOException e) {
				System.out.println("An error occured writing the file.");
			}
		}
	}
	

	// 'CountCharactersInFile' counts the number of characters in a given filename
    // and return the count as an int. If there are no characters in the file or if
    // the file does not exist it returns -1.
    // The parameter 'filename' -  is the name of the file WITHOUT any extension e.g. "file1"
    // The file must already exist in the directory 'c:\TASKBPART2FILES'
    // The method will check to see if the directory and file exists.
    // If the directory or file does not exist the method returns -1
    // Otherwise the method will return the count of the characters in the file.
	public static int CountCharactersInFile(String filename) {
		File directory = new File("c:\\TASKBPART2FILES");

		if (filename.isEmpty() || filename == null) {
			return -1;
		} else {
			if (!directory.exists()) {
				return -1;
			} else {
				File file = new File(directory.toString() + "\\" + filename + ".txt");

				if (!file.exists()) {
					return -1;
				} else {
					int charCount = 0;

					try (Scanner reader = new Scanner(file, "utf-8")) {

						while (reader.hasNextLine()) {

							charCount += reader.nextLine().length();
						}
					} catch (FileNotFoundException e) {
						System.out.println("File not found.");
					}
					return charCount;
				}

			}

		}
	}

}
