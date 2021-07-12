package inheritanceBasics;

public class Inheretance1 {

	public static void main(String[] args) {

		Bird bird1 = new Bird("Sid", 10, 30, "grey", true);
		bird1.fly();

		Bird bird2 = new Bird("Flappy", 30, 20, "white", false);
		bird2.fly();
		
		Ostrich bird3 = new Ostrich();
		bird3.petName = "Leopoldina";
	}

}

class Bird {

	String petName;
	double height;
	double wingSpan;
	String beakColor;
	boolean canFly;

	public void fly() {
		if (canFly) {
			System.out.println(this.petName + " is flying.");
		} else {
			System.out.println(this.petName + " cannot fly.");
		}
	}
	public Bird() {
		System.out.println("A new bird has been created");
	}

	public Bird(String petName, double height, double wingSpan, String beakColor, boolean canFly) {
		this.petName = petName; //Reminder that the this keyword is only used to stop ambiguity
		this.height = height; 
		this.wingSpan = wingSpan;
		this.beakColor = beakColor;
		this.canFly = canFly;
		System.out.println("A new bird object has been created.");
	}
}

class Ostrich extends Bird{
	
	
}
