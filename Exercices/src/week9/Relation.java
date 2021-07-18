package week9;

public class Relation {

	public static void main(String[] args) {
		// Make a new Supplier object
		Supplier sup1 = new Supplier("Cool Beans Corp.", "Uganda");
		// Make a new Product and set it's supplier to the the above supplier object
		Product prod1 = new Product("Beans", sup1);

		System.out
				.println(prod1.name + " comes from " + prod1.supplier.country + " supplied by " + prod1.supplier.name);
	}

}

//Make a Supplier class
class Supplier {
	String name;
	String country;

	public Supplier(String name, String country) {
		this.name = name;
		this.country = country;
	}
}

//Make a Product class that has a Supplier as a member of that class
//(Each product has a supplier)

class Product {
	Supplier supplier;
	String name;

	public Product(String name, Supplier supplier) {
		this.supplier = supplier;
		this.name = name;
	}

}