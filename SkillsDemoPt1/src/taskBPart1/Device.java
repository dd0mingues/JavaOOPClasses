package taskBPart1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//class that defines a device
public class Device {
	
	//all the variables of a device
	private String name;
	private double price;
	private String manufacturer;
	private String porductCode;

	//getter methods to apply to the device. to get all the variables defined above.
	public String getName() {
		return this.name;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public String getCode() {
		return this.porductCode;
	}

	public double getPrice() {
		return this.price;
	}

	//Constructor to create a device.
	public Device(String name, double price, String productCode, String manufacturer) {
		this.manufacturer = manufacturer;
		this.name = name;
		this.price = price;
		setCode(productCode);
	}
	
	//method to check if the product code is up to the standard
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
