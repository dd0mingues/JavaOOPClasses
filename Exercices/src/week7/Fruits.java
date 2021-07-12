package week7;

public class Fruits {
	public static void main(String[] args) {

		Fruit genericFruit = new Fruit();
		System.out.println("There are " + Fruit.getFruitCount() + " types fruits in the registry.");

		Blueberry bb1 = new Blueberry("Spain", "Dark Blue", "The Spanish Inquisition", 2.50);
		Blueberry bb2 = new Blueberry("Portugal", "Dark Blue", "A empresa da fruta", 3.50);
		System.out.println(bb1);
		System.out.println(bb2);

		System.out.println("There are " + Fruit.getFruitCount() + " types fruits in the registry.");
		// blueberry also inherits the private fields. so we can do
		// Blueberry.getFruitCount();
		System.out.println("There are " + Blueberry.getBlueberryCount() + " types blueberries in the registry.");

		Banana banana1 = new Banana("Madeira", "Yellow", "A empresa da fruta", 0.60);
		Banana banana2 = new Banana("Banana Republic", "Yellow", "Monkey buisness", 0.85);
		Banana banana3 = new Banana("Madagascar", "Yellow", "Kowalski & Co.", 0.35);
		System.out.println(banana1);
		System.out.println(banana2);
		System.out.println(banana3);
		System.out.println("There are " + Banana.getFruitCount() + " types of fruits in total, of wich, "
				+ Banana.getBananaCount() + " are Bananas.");

	}
}

//Make a fruit class that has a country of origin, color, supplier, price

//Make a class called Blueberry that inherits from fruit that
//has a constructor that sets the color, price, supplier and country of origin.
//The Blueberry class should have an overridden toSting method that shows all
//the details for the blueberry object.

class Fruit { //this extends to the Object class, that gives this class more methods.
	private static int fruitCount;

	String origin;
	String color;
	String supplier;
	double price;

	public Fruit() {
		System.out.println("\nA new fruit has been created.");
		fruitCount++;
	}

	public static int getFruitCount() {
		return fruitCount;
	}
}

class Blueberry extends Fruit {
	private static int blueberryCount;

	public Blueberry(String origin, String color, String supplier, double price) {
		System.out.println("The fruit is a Blueberry\n");
		this.origin = origin;
		this.color = color;
		this.supplier = supplier;
		this.price = price;

		blueberryCount++;
	}

	public static int getBlueberryCount() {
		return blueberryCount;
	}

	@Override //compiler directive
	public String toString() {
		return "This Blueberry comes from " + origin + ". It has a beautiful " + color + " color and it is priced at "
				+ price + "€ per 100 grams. Suplied by " + supplier + ".";
	}

}

class Banana extends Fruit {
	private static int bananaCount;

	public Banana(String origin, String color, String supplier, double price) {
		System.out.println("The fruit is a Banana\n");
		this.origin = origin;
		this.color = color;
		this.supplier = supplier;
		this.price = price;

		bananaCount++;
	}

	public static int getBananaCount() {
		return bananaCount;
	}

	@Override
	public String toString() {
		return "This Banana comes from " + origin + ". It has a beautiful " + color + " color and it is priced at "
				+ price + "€ per unit. Suplied by " + supplier + ".";
	}
}