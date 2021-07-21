package animals;

public class Ape extends Primate {
	private static int ApeCount;

	public static int getApeCount() {
		return ApeCount;
	}

	public Ape() {
		ApeCount += 1;
	}
	
	public void makeNoise() {
		System.out.println("UHUH!");
	}
}