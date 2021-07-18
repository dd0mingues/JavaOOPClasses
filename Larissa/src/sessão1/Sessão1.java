package sessão1;

public class Sessão1 {
	public static void main(String[] args) {

		// Make and array or ArrayList of things that 'Move'

		Car car1 = new Car();
		Car car2 = new Car();
		Bike bike1 = new Bike();
		Bike bike2 = new Bike();

		// Add the objects to the array/arrayList that move
		Move[] move = new Move[] { car1, car2, bike1, bike2 };

		// Use loops to demonstrate the 'Move' interface in use
		for (int i = 0; i < move.length; i++) {
			move[i].Forward();
		}

		for (int i = 0; i < move.length; i++) {
			move[i].Backwards();
		}
	}
}

// Interface called 'Move' that declares methods to move forward and move
// backwards
interface Move {
	public void Forward();

	public void Backwards();

}

// Make a Car class with driveForward and reverse methods
// the Car class should also implement the 'Move' interface
class Car implements Move {

	@Override
	public void Forward() {
		System.out.println("The car is moving. ");
	}

	@Override
	public void Backwards() {
		System.out.println("The car is reversing.");

	}
}

// Make a Bicycle class has methods called cycleForward and cycleBackward
// the Bicycle class should also implement the 'Move' interface
class Bike implements Move {

	@Override
	public void Forward() {
		System.out.println("The bike is moving. ");
	}

	@Override
	public void Backwards() {
		System.out.println("The bike is reversing.");

	}
}