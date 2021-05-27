package classesIntroduction;

public class MyPhone {
	
	public static void main(String[] args) {
		
		CellPhone myNewPhone = new CellPhone("Google", "Pixel 4A", 349.99);
	
		System.out.println("My phone is " 
				+ myNewPhone.getManufacturer() + " " + myNewPhone.getModelNumber() 
				+ ". It costs €" + myNewPhone.getRetailPrice() + ".");
	}
	
}
