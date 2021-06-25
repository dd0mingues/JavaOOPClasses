package week5;

public class Classes {
	public static void main(String[] Args) {
		
		Car car1 = new Car();
		
		car1.make = "Ford";
		car1.model = "Focus";
		car1.year = 2013;
		car1.milage = 125000;
		car1.reg = "132D3291";
		//car1.running = true; does not work bcs it is set to private
		
		System.out.println("Your car is a " + car1.make + " " +car1.model + " from " + car1.year 
				+  ". It's registration number is " + car1.reg + " and it's mileage is " 
				+ car1.milage + ".");
		
		//linebreak
		System.out.println("");
				
		//Car car2 = new Car();
		Car car3 = car1;
		
		car3.model = "Mondeo"; //bcs car3 is pointing at the car1, changing car3 changes car1
		System.out.println(car1.model);
		System.out.println(car3.model);
		
		//linebreak
		System.out.println("");
		
		car1.start();
		car1.start();
		car1.stop();
		car1.stop();
		
		
	}
}

class Car{
	
	//instance variables (attributes)
	String make;
	String model;
	int year;
	String reg;
	int milage;
	//this one is private so it can't be changed by setting car1.running = true in the main
	private boolean running; //default value of false, but we can set a default value 
	//boolean running = true;
	
	//instance methods (behaviors)
	public void start() {
		if(!running) { //check if car is stopped and set the state of the car to running
			System.out.println("VROOM! The car has started!");
			running = true;
		}
		else {
			System.out.println("This car is already running.");
		}
	}
	public void stop() {
		if(running) { //check if car is stopped and set the state of the car to running
			System.out.println("Car stopped.");
			running = false;
		}
		else {
			System.out.println("Engine is already off!");
		}
	}
	public void beep() {
		System.out.println("BEEP BEEP!");
	}
	//NOTE cannot create classes with the same name within the same package
	
}
