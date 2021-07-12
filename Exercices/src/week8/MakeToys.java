package week8;

public class MakeToys {

	public static void main(String[] args) {
		FreeToyGift gift1 = new FreeToyGift();
		System.out.println("The price of " + gift1 + " is " + gift1.getPrice() + "€");

		Teddy teddy1 = new Teddy("Mr.Hugs", 24.99, true);
		Teddy teddy2 = new Teddy("Sonic the Hedgehog", 19.99, false);
		Jigsaw jig1 = new Jigsaw("Taj Mahal", 24.99);
		Jigsaw jig2 = new Jigsaw("Disney World", 19.99);
		teddy1.getText();

		System.out.println("\n");

		Toy[] toyBasket = new Toy[] { gift1, teddy1, teddy2, jig1, jig2 };

		for (Toy item : toyBasket) {
			
			System.out.println("Found a " + item.getClass().getSimpleName() + " in the basket. \nIt's name is " + item
					+ " and it costs " + item.getPrice() + " €.");
		}
	}

}

abstract class Toy { // cannot make and instance (object) of an abstract class
	private double price;
	private boolean requiresBatteries;

	public double getPrice() {
		return price;
	}

	public boolean getBatteries() {
		return requiresBatteries;
	}

	public Toy(double price, boolean requiresBatteries) {
		this.price = price;
		this.requiresBatteries = requiresBatteries;
	}
}

class Teddy extends Toy {
	private String teddyName;

	public String getTeddyName() {
		return teddyName;
	}

	public void getText() {
		if (getBatteries()) {
			System.out.println(teddyName + " costs " + getPrice() + " and does require batteries.");
		} else {
			System.out.println(teddyName + " costs " + getPrice() + " and does not require batteries.");
		}
	}

	public Teddy(String teddyName, double price, boolean requiresBatteries) {
		super(price, requiresBatteries);
		this.teddyName = teddyName;
	}

	@Override
	public String toString() {
		return teddyName;
	}
}

class Jigsaw extends Toy {
	String jigsawName;

	public Jigsaw(String jigsawName, double price) {
		super(price, false);
		this.jigsawName = jigsawName;
	}

	@Override
	public String toString() {
		return jigsawName;
	}
}

class FreeToyGift extends Toy {
	String giftName = "Mini battery-car";
	
	public FreeToyGift() {
		super(0, true);
	}

	@Override
	public String toString() {
		return giftName;
	}
}