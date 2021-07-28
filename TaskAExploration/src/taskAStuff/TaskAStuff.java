package taskAStuff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskAStuff {

	public static void main(String[] args) {

		Device[] devices = new Device[] { new Device("Envy Photo Printer", 89.99, "0123", "HP"),
				new Device("Zen Beam Projector", 29.99, "0124", "ASUS"),
				new Device("Belt Sander - 850W", 48.99, "0125", "GUILD"),
				new Device("S&S Video Baby Monitor", 129.99, "0126", "VTECH"),
				new Device("Wet & Dry El. Shaver", 60.99, "0127", "REMINGTON"),
				new Device("Astro Fi Telescope", 579.99, "0128", "CELESTRON"),
				new Device("Waterproof MP3 Player", 99.99, "0129", "SONY"),
				new Device("Microwave Oven 900W", 739.99, "0130", "PANASONIC"),
				new Device("Fog Free Mirror", 17.99, "0131", "CROYDEX"),
				new Device("Curl Hair Dryer", 97.99, "0132", "BABYLISS") };

	}

}

class Device {

	private String name;
	private double price;
	private String manufacturer;
	private String porductCode;

	public String getName() {
		return name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getCode() {
		return porductCode;
	}

	public double getPrice() {
		return price;
	}

	public Device(String name, double price, String productCode, String manufacturer) {
		this.manufacturer = manufacturer;
		this.name = name;
		this.price = price;
		setCode(productCode);
	}

	// if the product code is bad, it throws an exception
	private void setCode(String code) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{4}");
		Matcher match = pattern.matcher(code);
		if (!match.matches()) {
			throw new RuntimeException("Bad product code! It must be four character [a-zA-Z0-9]");
		} else {
			this.porductCode = code;
		}
	}

}