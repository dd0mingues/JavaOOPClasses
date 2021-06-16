package loops;

public class ForLoops {

	public static void main(String[] args) {

		int [] numbers = {23 , 4 , 66 , 56 , 34 , 77 , 99};
		
		String [] words = { "Apple" , "Pizza" , "Ninja" , "Jedi" , " Fishcake"};
		
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.println("#" + i + "\t" + numbers[i]);
		}
		
		//line break
		System.out.println("");
		
		for( String word : words) {
			System.out.println(word);
		}
	}

}
