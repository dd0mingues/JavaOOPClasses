package inheritanceBasics;

public class BasicInh2 {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.numberLegs = 4;
		animal1.hasWings = true;

		Monkey monkey1 = new Monkey();
		monkey1.numberLegs = 2;
		monkey1.canSwing = true;
		monkey1.hasWings = false;

		SpaceMonkey AlbertIII = new SpaceMonkey();
		AlbertIII.hasLaserGuns = true;

	}
}

class Animal {
	int numberLegs;
	boolean hasWings;

	public Animal() {
		System.out.println("A new Animal has been created.");
	}
}

class Monkey extends Animal {
	boolean canSwing;

	public Monkey() {
		System.out.println("EMBRACE MONKE");
	}
}

class SpaceMonkey extends Monkey {
	boolean hasLaserGuns;
	public SpaceMonkey() {
		System.out.println("MONKE GONNE TO SPACE");
	}
}
