package basicRules;

public class ComparisonAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "prospero";
		if (password.equals("prospero")) //this is how to check if strings are the same
			System.out.println("Password accepted.");
		else
			System.out.println("Sorry, that is not the correct password.");
		
		String firstName = "Jenny";
		if (firstName.compareTo("Joe") == 0) //read about compareTo()
			System.out.println("Name is the same");
		else
			System.out.println("Names are not the same." + firstName.compareTo("Joe"));
		
		/*
		 * while runs while is true
		 * do-while runs at least one time while its true
		 * do-ultil runs at least one time while its false
		 * for is a count controlled loop
		 * 
		 * */
		
		int count = 0; // variable initialized used for 
		while (count < 5){
			System.out.println("It is True " + count);
			count++;
		}
		System.out.println(count); //variable retains value outside of loop if it is initialized outside of loop
		
		for (int countA = 1; countA <=5; countA ++) { //variable countA does not have value outside of loop bcs it is initialized inside the loop
			System.out.println("Hello " + countA);
		}
		
	}
}
