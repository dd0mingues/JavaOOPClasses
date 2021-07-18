package animals;

import java.util.ArrayList;

public class WelcomeToTheJungleArrayList {

	public static void main(String[] args) {
		
		ArrayList<Horse> horses = new ArrayList<Horse>();
		
		horses.add(new Horse());
		horses.add(new Horse());
		horses.add(new Unicorn());
		horses.add(new Pegasus());
		
		((Unicorn) horses.get(2)).HornLength = 30;
		
		for(Horse horse : horses) {
			System.out.println(horse);
			if(horse.getClass().getSimpleName().equals("Unicorn")) {
				System.out.println("This unicorn horn lenght is " + ((Unicorn)horse).HornLength);
			}
		}
		
	}

}
