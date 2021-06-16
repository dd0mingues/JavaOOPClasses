package methods;

public class MethodsOverload {
	public static void main(String[] args) {
		
		printText("I like chocolate!");
		printText("I like IceCream!",5);
		printText(3);
		
	}
	
	//method overload, a way of working around the default value
	//method overload works as long as methods with the same 
	//name have different parameter types
	public static void printText(String text, int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.println(text);
		}
	}//when you input a string and an int
	
	public static void printText(String text) {
			System.out.println(text);
	}//when you only input a string
	
	public static void printText(int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.println(repeat + " what?");
		}
	}//when you only input an int
}
