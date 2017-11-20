/**
 * Semi truck implementation.
 * @author LoganDuck
 * @version 11/20/17
 */
public class SemiTractorTrailer extends Truck {
	protected int axles;
	public static final double PER_AXLE_TAX_RATE = 0.005;
	
	public SemiTractorTrailer(String ownerIn, String yearMakeModelIn, double valueIn, boolean alternativeFuelIn, double tonsIn, int axlesIn) {
		super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn, tonsIn);
		axles = axlesIn;
	}
	
	public int getAxles() {
		return axles;
	}
	
	public void setAxles(int axlesIn) {
		axles = axlesIn;
	}
	
	public double useTax() {
		return super.useTax() + (value * PER_AXLE_TAX_RATE * axles);
	}
	
	public String toString() {
		return super.toString() + " Axle Tax Rate: " + (PER_AXLE_TAX_RATE * axles);
	}
}
