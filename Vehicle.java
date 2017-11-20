import java.text.DecimalFormat;

/**
 * Abstract Vehicle class. Each type of Vehicle uses the methods to avoid repetition;
 * @author LoganDuck
 * @version 11/20/17
 */
public abstract class Vehicle {
	protected String owner = "";
	protected String yearMakeModel = "";
	protected double value = 0.0;
	protected boolean alternativeFuelType = false;
	private static int vehicleCount = 0;
	
	public Vehicle(String ownerIn, String yearMakeModelIn, double valueIn, boolean alternativeFuelTypeIn) {
		owner = ownerIn;
		yearMakeModel = yearMakeModelIn;
		value = valueIn;
		alternativeFuelType = alternativeFuelTypeIn;
		vehicleCount++;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String ownerIn) {
		owner = ownerIn;
	}

	public String getYearMakeModel() {
		return yearMakeModel;
	}

	public void setYearMakeModel(String yearMakeModelIn) {
		yearMakeModel = yearMakeModelIn;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double valueIn) {
		value = valueIn;
	}

	public boolean getAlternativeFuel() {
		return alternativeFuelType;
	}

	public void setAlternativeFuel(boolean alternativeFuelTypeIn) {
		alternativeFuelType = alternativeFuelTypeIn;	
	}
	
	public static int getVehicleCount() {
		return vehicleCount;
	}

	public static void resetFuelCount() {
		vehicleCount = 0;
	}

	abstract double useTax();

	public String toString() {
		String output;
		DecimalFormat f = new DecimalFormat("#,##0.00");
		if (getAlternativeFuel()) {
			output = getOwner() + ": " + this.getClass().getName() + " " + getYearMakeModel()
				+ " (Alternative Fuel)" + "\nValue: $" + f.format(getValue()) + " Use Tax: $" + f.format(useTax());
		} else {
			output = getOwner() + ": " + this.getClass().getName() + " " + getYearMakeModel()
				+ "\nValue: $" + f.format(getValue()) + " Use Tax: $" + f.format(useTax()); 
		}
		return output;
	}
}