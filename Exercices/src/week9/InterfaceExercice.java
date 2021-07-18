package week9;

import java.util.ArrayList;

public class InterfaceExercice {

	public static void main(String[] args) {

		// Make and array or ArrayList of things that 'Move'
		ArrayList<Move> vehiacles = new ArrayList<Move>();
		// Add the objects to the array/arrayList that move
		vehiacles.add(new Car());
		vehiacles.add(new Car());
		vehiacles.add(new Bike());
		vehiacles.add(new Bike());
		vehiacles.add(new Bike());
		// Use loops to demonstrate the 'Move' interface in use
		for(Move vehiacle : vehiacles) {
			vehiacle.moveFowards();
		}
		for(Move vehiacle : vehiacles) {
			vehiacle.moveBackwards();
		}

	}

}
// Interface called 'Move' that declares methods to move forward and move
// backwards

// Make a Car class with driveForward and reverse methods
// the Car class should also implement the 'Move' interface

// Make a Bicycle class has methods called cycleForward and cycleBackward
// the Bicycle class should also implement the 'Move' interface

interface Move{
	public void moveFowards();
	public void moveBackwards();
}

class Car implements Move{

	@Override
	public void moveFowards() {
		System.out.println("The car moved foward");
	}

	@Override
	public void moveBackwards() {
		System.out.println("The car moved backwards");
		
	}
	
}

class Bike implements Move{

	@Override
	public void moveFowards() {
		System.out.println("The bike moved foward");
		
	}

	@Override
	public void moveBackwards() {
		System.out.println("The bike moved backwards");
		
	}
	
}