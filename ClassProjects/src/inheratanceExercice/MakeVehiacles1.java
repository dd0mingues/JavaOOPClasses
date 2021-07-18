package inheratanceExercice;

import java.util.ArrayList;

public class MakeVehiacles1 {

	public static void main(String[] args) {

		Car car1 = new Car(Color.FUZZY_WUZZY);
		Car car2 = new Car(Color.ATOMIC_TANGERINE);
		Car car3 = new Car(Color.LEMON);
		Motorcycle moto1 = new Motorcycle();
		Motorcycle moto2 = new Motorcycle();
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		Propeller pro1 = new Propeller();
		Propeller pro2 = new Propeller();
		Jet jet1 = new Jet();
		Jet jet2 = new Jet();

		System.out.println("There are " + Car.getCount() + " cars, " + Motorcycle.getCount() + " motorcycles, "
				+ Bicycle.getCount() + " bicycles, " + Propeller.getCount() + " proppelers and " + Jet.getCount()
				+ " jets.");

		ArrayList<Vehiacle> vehiacles = new ArrayList<Vehiacle>();
		vehiacles.add(car1);
		vehiacles.add(car2);
		vehiacles.add(car3);
		vehiacles.add(moto1);
		vehiacles.add(moto2);
		vehiacles.add(bike1);
		vehiacles.add(bike2);
		vehiacles.add(pro1);
		vehiacles.add(pro2);
		vehiacles.add(jet1);
		vehiacles.add(jet2);
		
		for(Vehiacle vehiacle : vehiacles) {
			System.out.println(vehiacle);
		}

	}

}
