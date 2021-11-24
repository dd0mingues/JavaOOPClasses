package optionCombinations;

import java.math.BigInteger;

public class Combinations {
	public static void main( String args[]) {
		
		System.out.println(countCombinations(3,2));
		
	}
	
	private static String countCombinations(int strikes, int expiries) {
		
		
		
        int totalOptions = 2 * strikes * expiries;
        
        BigInteger result = new BigInteger("0");
        
        for( int j = 2; j<=totalOptions; j++) {
        	result = result.add( combination(totalOptions, j));
        }
        
        String s = result.toString();
        return s;
        
    }
	
	private static BigInteger combination(int n, int k) {	

		return factorial(k,n).divide(factorial(2,k));
		
	}
    
    private static BigInteger factorial(int floor, int roof){
    	
        BigInteger result = new BigInteger("1");
     	for( int i=floor; i<=roof; i++){
            result = result.multiply(new BigInteger(Integer.toString(i)));
        }
     	return result;
     	
    }
    
}
