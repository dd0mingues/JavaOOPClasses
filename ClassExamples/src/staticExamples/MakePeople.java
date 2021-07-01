package staticExamples;

public class MakePeople {

	public static void main(String[] args) {
		
		System.out.println("World population is " + Person.getWorldPop());
		@SuppressWarnings("unused")
		Person b1 = new Person();
		
		for(int i = 0; i<5000000; i++) {
			new Person();
		}
		System.out.println("World population is now " + Person.getWorldPop());

	}

}

class Person{
	private static long worldPop = 7_876_126_825L; //world population
	
	public Person() {
		worldPop++;
	}
	
	public static long getWorldPop() {
		return worldPop;
	}
}
