package arrays;

public class ArraysAndLoops {

	public static void main(String[] args) {
		
		int[] numbers = {4,5,6,7};
		double[] doubles = {10, 23.1, 44.5, 100.001};
		
//		for( int number : numbers) {
//			System.out.println((number+1)*number);
//		}
		
		//exercice 1
		System.out.println("The 4th number in the array is " + numbers[3]);
		numbers[3] += 23;
		System.out.println("The 4th number in the array is now " + numbers[3]);
		
		//exercice 2
		double result1 = doubles[doubles.length -1] + numbers[0];
		System.out.println("\nThe sum of the last number in the doubles array plus the first value in the int array is " +  result1);
		
		//exercice 3
		System.out.println("\nThe 3rd number in the doubles array is  " + doubles[2]);
		doubles[2] *= numbers[1];
		System.out.println("The 3rd number in the doubles array is now " + doubles[2]);
		
		//line break
		System.out.println("");
		
		//print out the numbers in the double array with their index
		int count = 0;
		for(double numD : doubles) {
			System.out.println("The number in index " + count + " is " + numD);
			count++;
		}
		
		//line break
		System.out.println("");
		
		// add 5 to every number in the array and print it
		for(int i=0; i < doubles.length; i++) {
			doubles[i] += 5;
			System.out.println("The number in index " + i + " is " + doubles[i]);
			
		}
		
		//sum the numbers in the array
		double sum = 0;
		for( double numD : doubles) {
			sum += numD;
		}
		System.out.println("\nThe sum of the array is " + sum);
		
		
	}

}
