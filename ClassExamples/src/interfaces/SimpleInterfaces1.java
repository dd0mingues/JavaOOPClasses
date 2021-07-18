package interfaces;

public class SimpleInterfaces1 {

	public static void main(String[] args) {
		
		Computer comp1 = new Computer("Dell XPS");
		Lawnmower mow1 = new Lawnmower();
		
		comp1.On();
		comp1.On();
		comp1.Off();
		mow1.On();
		
		Machine[] machines = new Machine[] {
				new Computer("Commodore 64"),
				new Computer("Atari 2600"),
				new Lawnmower()
		};
		
		for(Machine machine : machines) {
			machine.On();
		}
		

	}

}

interface SwitchOnOff{ //interfaces are abstract by default
	public void On();
	public void Off();
}

abstract class Machine implements SwitchOnOff{
	
}
class Computer extends Machine {

	String model;
	boolean isOn = false;

	public Computer(String model) {
		this.model = model;
	}

	public void switchOn() {
		if (isOn) {
			System.out.println("The " + model + " computer, is already on.");
		} else {
			System.out.println("The " + model + " computer, is now now");
			isOn = true;
		}
	}

	public void switchOff() {
		if (isOn) {
			System.out.println("The " + model + " computer, is now off");
			isOn = false;
		} else {
			System.out.println("The " + model + " computer, is already off");
		}
	}
	
	public void On() {
		this.switchOn();
	}
	public void Off() {
		this.switchOff();
	}
}

class Lawnmower extends Machine{
	
	boolean isOn = false;
	
	public void switchOn() {
		if (isOn) {
			System.out.println("The lawnmower is already on.");
		} else {
			System.out.println("The lawnmower is is now now");
			isOn = true;
		}
	}

	public void switchOff() {
		if (isOn) {
			System.out.println("The lawnmower is is now off");
			isOn = false;
		} else {
			System.out.println("The lawnmower is is already off");
		}
	}
	
	public void On() {
		this.switchOn();
	}
	public void Off() {
		this.switchOff();
	}
}