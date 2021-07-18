package inheratanceExercice;

import javax.sound.sampled.Port;

public abstract class Vehiacle {

	private static int vehiacleCount;
	private String modelNumber;
	private String serialNumber;
	Person owner;

	public Vehiacle() {
		vehiacleCount += 1;
	}

	public void setModel(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getModel() {
		return modelNumber;
	}

	public void setSerial(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerial() {
		return serialNumber;
	}

	@Override
	public String toString() {
		String output = "I am an instance of a " + this.getClass().getSimpleName() + " class.";
		return output;
	}

	public static int getCount() {
		return vehiacleCount;
	}
}

//*******************LVL2*******************//

abstract class LandVehiacle extends Vehiacle {
	private static int landVehiacleCount;
	public Color color;

	public LandVehiacle() {
		landVehiacleCount += 1;
	}

	public static int getCount() {
		return landVehiacleCount;
	}
}

abstract class AirVehiacle extends Vehiacle {
	private static int airVehiacleCount;

	public AirVehiacle() {
		airVehiacleCount += 1;
	}

	public static int getCount() {
		return airVehiacleCount;
	}
}

class WaterVehiacle extends Vehiacle {
	private static int waterVehiacleCount;

	public WaterVehiacle() {
		waterVehiacleCount += 1;
	}

	public static int getCount() {
		return waterVehiacleCount;
	}
}

//*******************LVL3*******************//

class FourWheels extends LandVehiacle {
	private static int fourWheelsCount;

	public FourWheels(Color color) {
		fourWheelsCount += 1;
	}

	public static int getCount() {
		return fourWheelsCount;
	}
}

class TwoWheels extends LandVehiacle {
	private static int twoWheelsCount;

	public TwoWheels() {
		twoWheelsCount += 1;
	}

	public static int getCount() {
		return twoWheelsCount;
	}
}

class Powered extends WaterVehiacle {
	private static int poweredCount;

	public Powered() {
		poweredCount += 1;
	}

	public static int getCount() {
		return poweredCount;
	}
}

class Unpowered extends WaterVehiacle {
	private static int unpoweredCount;

	public Unpowered() {
		unpoweredCount += 1;
	}

	public static int getCount() {
		return unpoweredCount;
	}
}

//*******************LVL4*******************//

class Car extends FourWheels {
	private static int carCount;

	public Car(Color color) {
		super(color);
		carCount += 1;
		System.out.println("A new Car has been created, there are now " + carCount + " Cars in the system.");
	}

	public static int getCount() {
		return carCount;
	}
}

class Motorcycle extends TwoWheels {
	private static int MotorcycleCount;

	public Motorcycle() {
		MotorcycleCount += 1;
		System.out.println(
				"A new Motorcycle has been created, there are now " + MotorcycleCount + " Motorcycles in the system.");
	}
	
	public static int getCount() {
		return MotorcycleCount;
	}
}

final class Bicycle extends TwoWheels {
	private static int bicyleCount;

	public Bicycle() {
		bicyleCount += 1;
		System.out.println("A new Bicycle has been created, there are now " + bicyleCount + " Bicycle in the system.");
	}

	public static int getCount() {
		return bicyleCount;
	}
}

class Propeller extends Powered {
	private static int propellerCount;

	public Propeller() {
		propellerCount += 1;
		System.out.println(
				"A new Propeller has been created, there are now " + propellerCount + " Propeller in the system.");
	}

	public static int getCount() {
		return propellerCount;
	}
}

class Jet extends Powered {
	private static int jetCount;

	public Jet() {
		jetCount += 1;
		System.out.println("A new Jet has been created, there are now " + jetCount + " Jet in the system.");
	}

	public static int getCount() {
		return jetCount;
	}
}

enum Color {
	UNDEFINED, BLACK, WHITE, BLUE, GREEN, RED, YELLOW, PINK, PURLE, CYAN, GREY, LIME, ATOMIC_TANGERINE, BEIGE, CANARY,
	FUZZY_WUZZY, FUSHIA, INDIGO, JADE, JASMINE, KOBE, KOBI, LAVA, LEMON, LIBERTY, MAGENTA, MYSTIC;
}