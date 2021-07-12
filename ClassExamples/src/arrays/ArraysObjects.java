package arrays;

public class ArraysObjects {

	public static void main(String[] args) {

		Car car1 = new Car("Toyota", "Prius");
		Car car2 = new Car("Toyota", "Hilux");
		Car car3 = new Car("Ford", "Mondeo");
		Car car4 = new Car("Ford", "Ranger");
		Car car5 = new Car("Mercedes", "Class C");

//		reference = thing
//		int[] numbers1 = {1,2,3,4};
//		double[] numbers2 = new double[5];
//		char[] chars1 = new char[] {'1', 'A', '@', '&'};

		Car[] myCars = new Car[5];

		myCars[0] = car1;
		myCars[1] = car2;
		myCars[2] = car3;
		myCars[3] = car4;
		myCars[4] = car5;

//		myCars[4].beep();

		System.out.println("The car at index 0 in myCars is a " + myCars[0]);
		
		for (Car car : myCars) {
			System.out.println(car);
			car.beep();
		}
	}

}

class Car {
	String make;
	String model;

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void beep() {
		System.out.println("The " + make + " " + model + " is beeping!");
	}

	@Override
	public String toString() {
		return make + " " + model;
	}

}