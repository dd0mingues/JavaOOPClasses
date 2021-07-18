package inheratanceExercice;

public class Person {
	private String fName;
	private String lName;
	
	public Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	public String getName() {
		return fName + " " + lName;
	}
}
