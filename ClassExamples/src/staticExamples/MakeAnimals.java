package staticExamples;

public class MakeAnimals {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Dog dog1 = new Dog("Fiddo");
		Dog dog2 = new Dog("Luna");
		Dog dog3 = new Dog("Attento");
		
		Dog.getDogCount();
		
		Dog dog4 = new Dog("Canino");
		Dog dog5 = new Dog("Max");
		
		Dog.getDogCount();
	}

}

class Dog{
	//Instance field
	String name;
	
	//Static field
	private static int dogCount;
	
	//constructor
	public Dog(String name) {
		System.out.println(name + " has been added to the registry.");
		this.name = name;
		dogCount++;
	}
	
	//methods
	//public - we want to access getDogCount outside of the Dog class
	//static - getDogClass is a property of the whole class, not a singular object
	//void - returns nothing
	public static void getDogCount(){
		System.out.println("\nThere are " + dogCount + " dogs in the registry.\n");
	}
}//end of Dog class
