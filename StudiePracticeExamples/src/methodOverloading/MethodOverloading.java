package methodOverloading;

public class MethodOverloading {
	public static void main(String[] args) {
		
		double resultado = sumNumbers(3,4);
		System.out.println(resultado);
		
		System.out.println(sumNumbers(4,5,2));
		
		System.out.println(sumNumbers("Olá sou eu"));
		
		
	}
	
	public static double sumNumbers(double x, double y) {
		double sum = x + y ;
		return sum;
	}
	
	public static double sumNumbers(double x, double y, double z) {
		return x + y + z;
	}
	
	public static String sumNumbers(String x) {
		return "You cannot sum Strings";
	}
	
	
}
