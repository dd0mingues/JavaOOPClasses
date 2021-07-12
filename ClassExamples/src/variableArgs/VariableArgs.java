package variableArgs;

public class VariableArgs {

	public static void main(String[] args) {
		printStuff("hello","darksness","my","old","friend");
		System.out.println("The sum is: " + sumNumbers(3,4,6,7,8,12,3,1));
	}
//	
//	static void printStuff(String text) {
//		System.out.println(text);
//	}
//	
//	static void printStuff(String text1, String text2) {
//		System.out.println(text1 + "\n" + text2);
//	}
//	
//	static void printStuff(String[] texts) {
//		for( String text : texts) {
//			System.out.println(text);
//		}
//	}

	static void printStuff(String ...texts) { // this can take any number of strings, even an array of strings
		for (String text : texts) {
			System.out.println(text);
		}
	}
	
	static double sumNumbers(double ...nr) {
		double sum = 0 ;
		for(double n : nr) {
			sum += n;
		}
		return sum;
	}
}
