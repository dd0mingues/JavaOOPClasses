package methods;

public class MethodIntroduction5 {
	public static void main(String[] args) {
		
		int[] numbers1 = {1,2,3,4,5};
		int[] numbers2 = {5,4,3,2,1};
		
//		int[] addedNumbers = new int[5];
		
//		for(int i=0; i<addedNumbers.length; i++) {
//			addedNumbers[i]=numbers1[i]+numbers2[i];
//			System.out.println("Added numbers #" + i + "\t" + addedNumbers[i]);
//		}
		
		processNumbers(sumArray(numbers1, numbers2));
		
		
	}
	
	public static int[] sumArray(int[] array1, int[] array2) {
		int[] sum = new int[array1.length];
		for(int i=0; i<array1.length; i++) {
			sum[i]=array1[i]+array2[i];
		}
		return sum;
	}
	
	public static void processNumbers(int[] numbers) {
		for(int i=0; i<numbers.length ; i++) {
			System.out.println("#" + i + "\t" + numbers[i]);
		}
	}
}
