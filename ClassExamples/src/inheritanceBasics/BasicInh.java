package inheritanceBasics;

public class BasicInh {

	public static void main(String[] args) {

		A myA = new A();
		myA.x = 5;
		System.out.println(myA.x);

		B myB = new B();
		myB.x = 55;
		System.out.println(myB.x);

		C myC = new C();
		myC.x = 100;

		myA.x = 1;
		myB.x = 9;
		myB.y = 12;
		myC.x = 4;
		myC.y = 3;
		myC.z = 2;
		
		myA.methodA();
		myB.methodA();
		myB.methodB();
		myC.methodA();
		myC.methodB();
		
	}

}

class A {
	
	int x;
	private int p = 40000; // private values are not accessible by inheritance
	
	public void methodA() {
		System.out.println("I am the method defined in A");
	}
	
	public void showP() {
		System.out.println(p);
	}
}

class B extends A {
	int y;
	public void methodB() {
		System.out.println("I am the method defined in B");
	}
}

class C extends B {
	int z;
	
	@Override
	public void methodA() {
		System.out.println("I am the overridden methodA()");
	}
}