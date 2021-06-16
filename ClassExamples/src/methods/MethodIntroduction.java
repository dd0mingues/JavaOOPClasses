package methods;

public class MethodIntroduction {
	public static void main(String[] args) {
		System.out.println("I am the main method");
		function1();
		function2();
		function1();
		function3(); //() invocation operator
		
	}
	
	public static void function1() {
		System.out.println("\nI am function 1");
	}
	
	public static void function2() {
		for( int i =0; i<4; i++) {
			System.out.println("Looping inside function 2");
		}
	}
	
	public static void function3() {
		System.out.println("Void methods return nothing when called but we cant output to the console");
	}

}
