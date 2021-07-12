package week8;

public class LoadsOfBS {

	public static void main(String[] args) {

		A myA1 = new A();
		A myA2 = new A();

		B myB1 = new B();
		B myB2 = new B();

		myA1.x = 44;
		myA2.x = 55;
		myB1.x = 88;
		myB2.x = 100;
		myB1.z = 99;
		myB1.z = 200;

		A[] stuff = new A[4]; // an array of A's can hold A B and C

		// Put stuff in the array
		stuff[0] = myA1;
		stuff[1] = myB1;
		stuff[2] = myA2;
		stuff[3] = myB2;

		for (int i = 0; i < stuff.length; i++) {
			// System.out.println(stuff[i]);
			System.out.println(stuff[i].x);
			// System.out.println(stuff[i].z);
		}

		B[] loadOfbs = new B[3]; // an array of B cant hold A

		loadOfbs[0] = myB1;
		loadOfbs[1] = myB2;
		loadOfbs[2] = new B();

		// loop through the loadofbs and print whatever is accessible

		for (B bs : loadOfbs) {
			System.out.println(bs.x + "/" + bs.z);
		}

		// Make C class that extends B
		// and has a String field

		C C1 = new C();
		C1.x = 12;
		C1.z= 55;
		C1.linha = "Tadahh!";

		A[] abcArray = new A[] { myA1, myB1, C1, new C() };

		for (A a : abcArray) {
			String objectType = a.getClass().getSimpleName();
			if (objectType.equals("A")) {
				System.out.println("This object is type A");
				System.out.println("This A's x value is " + a.x);
			}
			if (objectType.equals("B")) {
				System.out.println("This object is type B");
				B objB = (B) a;
				System.out.println("This B's x value is " + objB.x + " and it's z value are " + objB.z);
			}
			if (objectType.equals("C")) {
				System.out.println("This object is type C");
				C objC = (C) a;
				System.out.println("This B's x value is " + objC.x + ", it's z value are " + objC.z
						+ " and it's string is " + objC.linha);
			}
		}
	}
}

class A {
	int x;

	public A() {
		System.out.println("A new A object has been created.");
	}
}

class B extends A {
	int z;

	public B() {
		System.out.println("A new B object has been created.");
	}
}

class C extends B {
	String linha;

	public C() {
		System.out.println("A new C object has been created.");
	}
}
