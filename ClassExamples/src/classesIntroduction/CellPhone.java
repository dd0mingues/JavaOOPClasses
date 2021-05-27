package classesIntroduction;

public class CellPhone {
	private String manufacturer;
	private String modelNumber;
	private double retailPrice;
	
	public CellPhone(String manuf, String model, double price) {
		this.manufacturer = manuf;
		this.modelNumber = model;
		this.retailPrice = price;
	}
	
	// method definitions
	public void setManufacturer(String manuf) {
		manufacturer = manuf;
	}
	
	public void setModelNumber(String modNum) {
		modelNumber = modNum;
	}
	
	public void setRetailPrice(double retailP) {
		retailPrice = retailP;
	}
	
	public String getModelNumber() {
		return modelNumber;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public double getRetailPrice() {
		return retailPrice;
	}
}
