package arrayList;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] Args) {

		ArrayList<A> myAs = new ArrayList<A>();// arraysLists are the same as arrays but its length can be altered

		A a1 = new A();
		a1.x = 55;
		myAs.add(a1);

		myAs.add(new A());
		myAs.get(1).x = 99;

		myAs.add(new B());
		myAs.add(new B());

		for (A item : myAs) {
			if (item.getClass().getSimpleName().equals("A")) {
				System.out.println("A class. x = " + item.x);
			} else {
				B castItem = (B) item;
				System.out.println("B class. y = " + castItem.y);
			}
		}
	}
}

class A {
	int x;
}

class B extends A {
	int y;
}