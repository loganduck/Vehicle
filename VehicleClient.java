/**
 * Client driver for the methods to output examples,
 * @author LoganDuck
 * @version 11/20/17
 */
public class VehicleClient {
	public static void main(String[] args) {
		Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
		Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
		Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe", 110000, false);
		Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe", 110000, true);
		Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 30000, false, 1.5);
		Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 40000, true, 2.5);
		SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", "2012 International Big Boy", 45000, true, 5.0, 4);
		Motorcycle bike1 = new Motorcycle("Brando, Marlon", "1964 Harley-Davidson Sportster", 14000, false, 750);
		
		System.out.println(car1.toString() + "\n");
		System.out.println(car2.toString() + "\n");
		System.out.println(car3.toString() + "\n");
		System.out.println(car4.toString() + "\n");
		System.out.println(truck1.toString() + "\n");
		System.out.println(truck2.toString() + "\n");
		System.out.println(semi1.toString() + "\n");
		System.out.println(bike1.toString() + "\n");
	}
}