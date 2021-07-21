package animals;

public class Donkey extends Equidae {
	private static int DonkeyCount;

	public static int getDonkeyCount() {
		return DonkeyCount;
	}

	public Donkey() {
		DonkeyCount += 1;
	}
	
	public void makeNoise() {
		System.out.println("IH HOOOOO!");
	}
}