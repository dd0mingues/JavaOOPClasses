package exeptionHandeling;

public class ExeptionHandeling1 {

	public static void main(String[] args) {
		String[] stuff = { "Apple", "Kiwi", "Pear" };

		// try block
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(stuff[i]);
				// stuff[3] throws an exception
			}
			System.out.println("Got everything out of the array!"); // inside the try block, if an exception is thrown,
																	// it skips to the catch block
		} catch (Exception e) {
			System.out.println("Something bad happened, but I've handeled it!");
			System.out.println(e.getMessage());
		}

		System.out.println("End of program."); // if exception is thrown, the rest of the code does not run

	}

}
