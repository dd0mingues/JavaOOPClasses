package classesAndObjectsIMPORTANT;


public class ObjectsIntro {
	public static void main(String[] args) {
		
		// create a new object of type MyClass
		MyClass myClass1 = new MyClass();
		myClass1.x = 50;
		myClass1.y = 199;
		System.out.println(myClass1.x);
		System.out.println(myClass1.y);
		
		MyClass myClass2 = new MyClass();
		System.out.println(myClass2.x);
		System.out.println(myClass2.y);
		
	}
} //end of the class

class MyClass{ //classification (classify what type of thing the "object" is)
	public int x;
	public int y;
}
