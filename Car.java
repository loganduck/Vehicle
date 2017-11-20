/**
 * Car implementation;
 * @author LoganDuck
 * @version 11/20/17
 */
public class Car extends Vehicle {
	public static final double TAX_RATE = 0.01;
	public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
	public static final double LUXURY_THRESHOLD = 50_000;
	public static final double LUXURY_TAX_RATE = 0.02;

	public Car(String ownerIn, String yearMakeModelIn, double valueIn, boolean alternativeFuelIn) {
		super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
	}
	
	public double useTax() {
		double tax;
		if (getAlternativeFuel()) {
			tax = value * ALTERNATIVE_FUEL_TAX_RATE;
		} else {
			tax = value * TAX_RATE;
		}
		
		if (value > LUXURY_THRESHOLD) {
			tax += value * LUXURY_TAX_RATE;
		}
		return tax;
	}

	public String toString() {
		String output;
		if (getAlternativeFuel()) {
			output = super.toString() + "\nwith Tax Rate: " + ALTERNATIVE_FUEL_TAX_RATE;
		} else {
			output = super.toString() + "\nwith Tax Rate: " + TAX_RATE;
		}
		if (value > LUXURY_THRESHOLD) {
			output += " Luxury Tax Rate: " + LUXURY_TAX_RATE;
		}
		return output;		
	}
}