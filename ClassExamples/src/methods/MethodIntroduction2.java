package methods;

public class MethodIntroduction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius1 = 23.45;
		double radius2 = 1.2;
		double radius3 = 2.4;
		
		areaOfCircle(radius1);
		areaOfCircle(radius2);
		areaOfCircle(radius3);
		
	}
	
	public static void areaOfCircle(double radius) {
		double area = Math.PI*radius*radius;
		System.out.println("The are of a circle with radius " + radius + " is: " + area + "!");
	}

}
