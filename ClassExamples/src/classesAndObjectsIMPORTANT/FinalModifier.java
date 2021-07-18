package classesAndObjectsIMPORTANT;

public class FinalModifier {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String cheese;
		cheese = "Cheese"; //trying to change cheese further, it will result in an error, bcs cheese is final 
		//cheese = "More cheese" will fail
		
		final B myB = new B();
		
	}

}
class A{
	
}
class B extends A{
	
}
final class C extends B{
	
}
//class D extends C{
//	cannot extend C - it is final
//}