package animals;

//************ LEVEL 1 CLASS
public abstract class Animal {

	private static int animalCount;

	private String[] color;
	AnimalSex sex;
	AnimalDiet diet;

	public Animal() {
		animalCount += 1;
		System.out.println("A new " + this.getClass().getSimpleName() + " has been created!");
	}

	public String getColor() {
		if (this.color == null) {
			return "Unkown";
		} else {
			String animalColor = "";
			for (String Color : this.color) {
				animalColor += Color + ", ";
			}
			return animalColor.substring(0, animalColor.length() - 2);
		}
	}

	public static int getAnimalCount() {
		return animalCount;
	}

	// variable number of arguments
	public void setColor(String... colorList) {
		this.color = new String[colorList.length];
		for (int i = 0; i < color.length; i++) {
			this.color[i] = colorList[i];
		}
	}

}

//enumerated type
enum AnimalDiet {
	OMNIVORE, CARNIVORE, HERBIVORE
}

enum AnimalSex {
	MALE, FEMALE, ASEXUAL, UNKNOWN
}

//classes
abstract class Mammal extends Animal {
	private static int mammalCount;

	public static int getMammalCount() {
		return mammalCount;
	}

	public Mammal() {
		mammalCount += 1;
	}
}

abstract class Bird extends Animal {
	private static int birdCount;

	public static int getBirdCount() {
		return birdCount;
	}

	public Bird() {
		birdCount += 1;
	}
}

abstract class Reptile extends Animal {
	private static int reptileCount;

	public static int getReptileCount() {
		return reptileCount;
	}

	public Reptile() {
		reptileCount += 1;
	}
}

//************ LEVEL 2 CLASS
abstract class Primate extends Mammal {
	private static int PrimateCount;

	public static int getPrimateCount() {
		return PrimateCount;
	}

	public Primate() {
		PrimateCount += 1;
	}
}

abstract class Equidae extends Mammal {
	private static int EquidaeCount;

	public static int getEquidaeCount() {
		return EquidaeCount;
	}

	public Equidae() {
		EquidaeCount += 1;
	}
}

abstract class BirdofPrey extends Bird {
	private static int BirdofPreyCount;

	public static int getBirdofPreyCount() {
		return BirdofPreyCount;
	}

	public BirdofPrey() {
		BirdofPreyCount += 1;
	}
}

abstract class Waterfowl extends Bird {
	private static int WaterfowlCount;

	public static int getWaterfowlCount() {
		return WaterfowlCount;
	}

	public Waterfowl() {
		WaterfowlCount += 1;
	}
}

abstract class Lizard extends Reptile {
	private static int LizardCount;

	public static int getLizardCount() {
		return LizardCount;
	}

	public Lizard() {
		LizardCount += 1;
	}
}

abstract class Snake extends Reptile {
	private static int SnakeCount;

	public static int getSnakeCount() {
		return SnakeCount;
	}

	public Snake() {
		SnakeCount += 1;
	}
}

//************ LEVEL 3 CLASS
class Human extends Primate {
	private static int HumanCount;

	public static int getHumanCount() {
		return HumanCount;
	}

	public Human() {
		HumanCount += 1;
	}
}

class Ape extends Primate {
	private static int ApeCount;

	public static int getApeCount() {
		return ApeCount;
	}

	public Ape() {
		ApeCount += 1;
	}
}

class Donkey extends Equidae {
	private static int DonkeyCount;

	public static int getDonkeyCount() {
		return DonkeyCount;
	}

	public Donkey() {
		DonkeyCount += 1;
	}
}

class Horse extends Equidae {
	private static int HorseCount;

	public static int getHorseCount() {
		return HorseCount;
	}

	public Horse() {
		HorseCount += 1;
	}
}

class Falcon extends BirdofPrey {
	private static int FalconCount;

	public static int getFalconCount() {
		return FalconCount;
	}

	public Falcon() {
		FalconCount += 1;
	}
}

class Hawk extends BirdofPrey {
	private static int HawkCount;

	public static int getHawkCount() {
		return HawkCount;
	}

	public Hawk() {
		HawkCount += 1;
	}
}

class Duck extends Waterfowl {
	private static int DuckCount;

	public static int getDuckCount() {
		return DuckCount;
	}

	public Duck() {
		DuckCount += 1;
	}
}

class Swan extends Waterfowl {
	private static int SwanCount;

	public static int getSwanCount() {
		return SwanCount;
	}

	public Swan() {
		SwanCount += 1;
	}
}

class Gecko extends Lizard {
	private static int GeckoCount;

	public static int getGeckoCount() {
		return GeckoCount;
	}

	public Gecko() {
		GeckoCount += 1;
	}
}

class KomodoDragon extends Lizard {
	private static int KomodoDragonCount;

	public static int getKomodoDragonCount() {
		return KomodoDragonCount;
	}

	public KomodoDragon() {
		KomodoDragonCount += 1;
	}
}

class Cobra extends Snake {
	private static int CobraCount;

	public static int getCobraCount() {
		return CobraCount;
	}

	public Cobra() {
		CobraCount += 1;
	}
}

class Python extends Snake {
	private static int PythonCount;

	public static int getPythonCount() {
		return PythonCount;
	}

	public Python() {
		PythonCount += 1;
	}
}

//*********** LEVEL 4 CLASS
class Pegasus extends Horse {
	private static int PegasusCount;

	public static int getPegasusCount() {
		return PegasusCount;
	}

	public Pegasus() {
		PegasusCount += 1;
	}
}

class Unicorn extends Horse {
	private static int UnicornCount;

	public static int getUnicornCount() {
		return UnicornCount;
	}

	public Unicorn() {
		UnicornCount += 1;
	}
}