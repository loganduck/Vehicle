/**
 * 
 * @author LoganDuck
 * @version 11/20/17
 */
public class Motorcycle extends Vehicle{
	protected double engineSize;
	public static final double TAX_RATE = 0.005;
	public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;
	public static final double LARGE_BIKE_CC_THRESHOLD = 499;
	public static final double LARGE_BIKE_TAX_RATE = 0.015;
	
	public Motorcycle(String ownerIn, String yearMakeModelIn, double valueIn, boolean alternativeFuelIn, double engineSizeIn) {
		super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
		engineSize = engineSizeIn;
	}
	
	public double getEngineSize() {
		return engineSize;
	}
	
	public void setEngineSize(double engineSizeIn) {
		engineSize = engineSizeIn;
	}
	
	public double useTax() {
		double tax;
		if (getAlternativeFuel()) {
			tax = value * ALTERNATIVE_FUEL_TAX_RATE;
		} else {
			tax = value * TAX_RATE;
		}
		if (engineSize > LARGE_BIKE_CC_THRESHOLD) {
			tax += value * LARGE_BIKE_TAX_RATE;
		}
		return tax;
	}
	
	public String toString() {
		String output = super.toString() + "\nwith Tax Rate: ";
		if (getAlternativeFuel()) {
			output += ALTERNATIVE_FUEL_TAX_RATE;
		} else {
			output += TAX_RATE;
		}
		if (engineSize > LARGE_BIKE_CC_THRESHOLD) {
			output += " Large Bike Tax Rate: " + LARGE_BIKE_TAX_RATE;
		}
		
		return output;
	}
}