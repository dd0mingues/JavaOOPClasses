package inheritanceBasics;

public class BasicInh3 {

	public static void main(String[] args) {

		Person p1 = new Person("Diogo", "Domingues");

		System.out.println(p1);
		System.out.println(p1.toString()); // without the overridden toString method it outputs
											// inheritanceBasics.Person@3fee733d

	}

}

class Person {
	String fName;
	String lName;

	public Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		System.out.println(fName + " " + lName + " was added to the registry.");
	}

	@Override
	public String toString() {
		return fName + " " + lName;
	}
}