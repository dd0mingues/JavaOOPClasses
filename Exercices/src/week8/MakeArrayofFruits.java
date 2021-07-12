package week8;

public class MakeArrayofFruits {

	public static void main(String[] args) {
		// make array of four fruits

		Fruit[] myFruits = new Fruit[] { new Fruit("Pear", 0.4), new Fruit("Apple", 0.5), new Fruit("Plum", 0.35),
				new Fruit("Avocado", 1.8), };
		// using the loop on the array, show the name of all the fruits
		for (Fruit fruit : myFruits) {
			System.out.println(fruit);
		}
		// using a loop, total the price of all the fruit
		double totalPrice = 0;
		for (Fruit fruit : myFruits) {
			totalPrice += fruit.price;
		}
		System.out.println("The total price is " + totalPrice);

	}

}
//fruit class
//fruits have name and price
//constructor to set the name and price ( per item)
//override the toString method to return just the fruits name 

class Fruit {

	String name;
	double price;

	public Fruit(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name;
	}
}