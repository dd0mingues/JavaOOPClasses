package interfaces;

public class SimpleInterfaces2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Duck duck1 = new Duck();
		Duck duck2 = new Duck();
		
		Penguin peng1= new Penguin();
		
		Pigeon pig1 = new Pigeon();
		Pigeon pig2 = new Pigeon();
		
		//make a collection of the classes that implement te flyer interface
		//Duck[] duckies = new Duck[2]; only ducks go in here
		
		Flyer[] flyers = new Flyer[] {
				duck1,
				duck2,
				pig1,
				pig2
		};
		
		for(Flyer flyer : flyers) {
			flyer.Fly();
		}
		for(Flyer flyer : flyers) {
			flyer.Land();
		}
	}
}

interface Flyer{
	public void Fly();
	public void Land();
}

class Duck implements Flyer{

	@Override
	public void Fly() {
		System.out.println("The duck is flying");
		
	}

	@Override
	public void Land() {
		System.out.println("The duck has landed");
	}
	
}

class Penguin{
	
}

class Pigeon implements Flyer{

	@Override
	public void Fly() {
		System.out.println("The pigeon is flying");		
	}

	@Override
	public void Land() {
		System.out.println("The pigeon has landed");
	}	
}