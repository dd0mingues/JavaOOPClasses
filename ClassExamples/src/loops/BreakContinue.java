package loops;

public class BreakContinue {
	public static void main(String[] args) {

		int [] numbers = {23 , 4 , 66 , 2 , 34 , 77 , 99, 2, 43, 2};
		
		int count = 0;
		for( int n : numbers) {
			if( n == 2) {
				count++;
			}
		}
		System.out.println("There are " + count + " 2's in the array.");
		
		
		for( int n : numbers) {
			if( n == 2) {
				System.out.println("There is at least one two in the array");
				break;
			}
		}
		
		System.out.println("\nArray without the 2's:");
		for( int n : numbers) {
			if( n == 2) {
				continue;
			}	
			System.out.print(n + "\t");
		}
	}

}
