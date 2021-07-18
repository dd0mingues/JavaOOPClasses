package classesAndObjectsIMPORTANT;

public class HasARelation {

	public static void main(String[] args) {

		Person p1 = new Person("Pete", "Jones");

		Pet fluffly = new Pet(p1, "Fluffy");

		System.out.println("The pet name is: " + fluffly.name);
		
		fluffly.owner.setFavFoods("Steak","Lasagna","Pizza");
		
		System.out.println("The pet owner is " + fluffly.owner.fName + " " + fluffly.owner.lName
				+ ". His/her favourite food is " + fluffly.owner.getFavFoods() + ".");
	}

}

class Pet {
	Person owner;
	String name;

	public Pet(Person owner, String name) {
		this.owner = owner;
		this.name = name;
	}
}

class Person {
	String fName;
	String lName;
	String[] favFoods;

	public Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	public void setFavFoods(String... foods) {
		this.favFoods = foods;
	}

	public String getFavFoods() {
		String foods = "";
		if (favFoods == null) {
			return "not yet set";
		} else {
			for (String food : favFoods) {
				foods += food + ", ";
			}
			return foods.substring(0, foods.length() - 2);
		}
	}
}