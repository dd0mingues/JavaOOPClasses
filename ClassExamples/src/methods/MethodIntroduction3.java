package methods;

import java.util.Scanner;

public class MethodIntroduction3 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me three numbers: ");
		double x = keyboard.nextDouble();
		double y = keyboard.nextDouble();
		double z = keyboard.nextDouble();
		
		multiply(x,y,z);
		keyboard.close();
		
		System.out.println(fullName("Diogo","Domingues"));
		
	}

	public static void multiply(double x, double y, double z) {
		double result = x*y*z;
		System.out.println(x + "*" + y + "*" + z + " = " + result);
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
}