package methods;

public class MethodIntroduction4 {

	public static void main(String[] args) {
		String[] favFoods = {"Apple","Steak","Pizza","Noodles","Cake"};
		showArrayContent(favFoods);
		
		//linebreak
		System.out.println("");
		
		String[] stuff = {"Hammer", "Leaf Blower", "Gardener", "Trousers"};
		showArrayContent(stuff);
		
		double[] doubles = {1.2,2,3.4,4,5.1};
		int[] ints = {6,7,8,9,10};
		
		//linebreak
		System.out.println("");
				
		processNumbers(doubles); //processNumbers expects double so we can't input an array of ints
		//linebreak
		System.out.println("");
		processNumbers(ints);	//now that we overloaded the method, we can input ints as a parameter
	
	}
	
	public static void showArrayContent(String[] array) {
		for(int i=0; i<array.length ; i++) {
			System.out.println("#" + i + "\t" + array[i]);
		}
	}
	
	public static void processNumbers(double[] numbers) {
		for(double d : numbers) {
			System.out.println("Doubles:\t" + d);
		}
	}
	
	public static void processNumbers(int[] numbers) {
		for(int d : numbers) {
			System.out.println("Intgers:\t" + d);
		}
	}

}
