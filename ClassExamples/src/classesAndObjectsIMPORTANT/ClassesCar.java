package classesAndObjectsIMPORTANT;

public class ClassesCar {
	public static void main(String[] args) {
		Car car1 = new Car(); //Car() is the constructor
		
		car1.drive(250);
		//System.out.println(car1.Mileage); Mileage is private so we cannot access it
		car1.showMileage();
		
		Car car2 = new Car("Ford","Focus");
		System.out.println(car2.getMake());
		
		car1.setMake("Nissan");
		car1.setModel("Almera");
		
		Car car3 = new Car("Tesla", "Model 3", 125000);
		car3.drive(30);
		System.out.println(car3.getMake() + " " + car3.getModel() + " now has " + car3.getMileage() + "km on the odometer.");
	}
}
