package classesAndObjectsIMPORTANT;

public class Car {
	
	//instance field variables, using this. refers to these variables
	private String make;
	private String model;
	private int mileage; //default value of 0
	
	public void drive(int distance) {
		System.out.println(make + " " + model + " drove for " +  distance + " km.");
		mileage += distance;
	}
	
	public void showMileage() {//this is necessary bcs Mileage is private.
		System.out.println("This car current mileage is: " + mileage + "km.");
	}
	
	// OVERLOAD AND AMBIGUITY -------------------------------------------------------
	public Car() {
		System.out.println("A new Car object has been created!");
	}
	
	public Car(String make, String model) { //class overload
		this.make = make;
		this.model = model;
		System.out.println(make + " " + model + " has been created!");
	}
	public Car(int mileage) {
		this.mileage = mileage;
		System.out.println("A new Car object with " + mileage + "km on the odometer has been created!");
	}
	public Car(String make, String model, int mileage) { //class overload
		this.make = make;
		this.model = model;
		this.mileage = mileage;
		System.out.println(make + " " + model + " with " + mileage + "km on the odometer has been created!");
	}
	

	//GETTERS AND SETTERS --------------------------------------------------------------
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMileage() {
		return mileage;
	}
}
