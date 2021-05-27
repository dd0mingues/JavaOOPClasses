package animalPolymorphism;

public class PolyDemo {
	
	public static void main(String[] args) {
		//Declare the class variations
		Dog myDog;
		Cat myCat;
		Horse myHorse;
		
		myDog = new Dog(); 
		myCat = new Cat();
		myHorse = new Horse();
		
		System.out.println("Dog:");
		showAnimalInfo(myDog);
		System.out.println("\nCat:");
		showAnimalInfo(myCat);
		System.out.println("\nHorse:");
		showAnimalInfo(myHorse);
	}
	
	
	
	private static void showAnimalInfo(Animal creature) {
		creature.showSpecies();
		creature.makeSound();
		creature.foodEaten();
		}

}
