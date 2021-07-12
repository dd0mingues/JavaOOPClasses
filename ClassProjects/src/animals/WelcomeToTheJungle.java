package animals;

public class WelcomeToTheJungle {

	public static void main(String[] args) {
		Animal animal1 = new Swan();
		animal1.sex = AnimalSex.MALE;
		animal1.diet = AnimalDiet.OMNIVORE;

		animal1.setColor("Pink", "Blue");

		System.out.println("The " + animal1.sex.toString().toLowerCase() + " animal is " + animal1.getColor()
				+ ". It's diet is " + animal1.diet.toString().toLowerCase());

		Animal animal2 = new Horse();
		Animal animal3 = new Pegasus();
		Animal animal4 = new Gecko();
		Animal animal5 = new Hawk();
		Animal animal6 = new Cobra();
		Animal animal7 = new Ape();
		Animal animal8 = new Duck();
		Animal animal9 = new Falcon();
		Animal animal10 = new Donkey();
		Animal animal11 = new Python();
		Animal animal12 = new KomodoDragon();
		Animal animal13 = new Human();
		Animal animal14 = new Unicorn();

		System.out.println("There are " + Animal.getAnimalCount() + " animals, of witch " + Mammal.getMammalCount()
				+ " are mammals, " + Bird.getBirdCount() + " are birds, and " + Reptile.getReptileCount()
				+ " are reptiles.");

	}

}
