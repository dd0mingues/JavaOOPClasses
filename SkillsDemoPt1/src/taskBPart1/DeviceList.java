package taskBPart1;

//created a class to store all the data
public class DeviceList {
	
	private static Device[] devices = new Device[] { 
			new Device("Envy Photo Printer", 89.99, "0123", "HP"),
			new Device("Zen Beam Projector", 29.99, "0124", "ASUS"),
			new Device("Belt Sander - 850W", 48.99, "0125", "GUILD"),
			new Device("S&S Video Baby Monitor", 129.99, "0126", "VTECH"),
			new Device("Wet & Dry El. Shaver", 60.99, "0127", "REMINGTON"),
			new Device("Astro Fi Telescope", 579.99, "0128", "CELESTRON"),
			new Device("Waterproof MP3 Player", 99.99, "0129", "SONY"),
			new Device("Microwave Oven 900W", 739.99, "0130", "PANASONIC"),
			new Device("Fog Free Mirror", 17.99, "0131", "CROYDEX"),
			new Device("Curl Hair Dryer", 97.99, "0132", "BABYLISS") };
	
	//created a get method that returns all the devices
	public static Device[] getDeviceArray() {
		return devices;
	}

}
