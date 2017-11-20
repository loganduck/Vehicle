/**
 * Truck implementation.
 * @author LoganDuck
 * @version 11/20/17
 */
public class Truck extends Vehicle{
	protected double tons;
	public static final double TAX_RATE = 0.02;
	public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;
	public static final double LARGE_TRUCK_TONS_THRESHOLD = 2.0;
	public static final double LARGE_TRUCK_TAX_RATE = 0.03;
	
	public Truck(String ownerIn, String yearMakeModelIn, double valueIn, boolean alternativeFuelIn, double tonsIn) {
		super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
		tons = tonsIn;
	}
	
	public double getTons() {
		return tons;
	}
	
	public void setTons(double tonsIn) {
		tons = tonsIn;
	}
	
	public double useTax() {
		double tax;
		if (getAlternativeFuel()) {
			tax = value * ALTERNATIVE_FUEL_TAX_RATE;
		} else {
			tax = value * TAX_RATE;
		}
		if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
			tax += value * LARGE_TRUCK_TAX_RATE;
		}
		return tax;
	}
	
	public String toString() {
		String output;
		if (getAlternativeFuel()) {
			output = super.toString() + "\nwith Tax Rate: " + ALTERNATIVE_FUEL_TAX_RATE
					+ " Large Truck Tax Rate: " + LARGE_TRUCK_TAX_RATE;
		} else {
			output = super.toString() + "\nwith Tax Rate: " + TAX_RATE;
		}
		return output;
	}
}