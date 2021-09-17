package oopStuff;

public class CommonTasks {

	public static void main(String[] args) {
		
		//user input
		java.util.Scanner k = new java.util.Scanner(System.in);
		
		//system class in java.lang 
		java.lang.System.out.print("Hello");
		
		//collections
		//ArrayList
		java.util.ArrayList<String> words = new java.util.ArrayList<String>();
		
		//working with files
		//java.io.* <- classes for reading/writing to files
		
		//maths
		System.out.println(java.lang.Math.PI);
		System.out.println(Math.sqrt(44));
		System.out.println(Math.max(5, 23));
		
		System.out.println(Math.random());
		
		java.util.Random myRandom = new java.util.Random();
		System.out.println(myRandom.nextInt());
		
		//javax.swing.* contains classes for creating GUI applications
		//such as JFrame and classes to add control to the GUI window.
		
		//databases
		//java.sql package provides classes and methods for reading and writing data to and from databases
		
		//threads
		try {
			java.lang.Thread.sleep(4000); //pause for 4 seconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of code");
		
		//close the opened scanner
		k.close();
	}

}
