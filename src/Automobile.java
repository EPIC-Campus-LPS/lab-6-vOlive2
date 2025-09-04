public class Automobile {
	private String make;
	private String model;
	private double mileage;
	private double fuel;
	private double fuelTank;

	Automobile(String mk, String mdl, double m, double fT) {
		make = mk;
		model = mdl;
		mileage = m;
		fuelTank = fT;
	}
	public void fillUp(double gallons) {
		fuel += gallons;
		if (fuel > fuelTank) {
			fuel = fuelTank;
		}
	}
	public void takeTrip(double miles) {
		int c = 0;
		boolean run = true;
		while(run) {
			c++;
			if(c == miles) {
				break;
			} else {
				if(fuel == 0) {
					System.out.print("YOU RAN OUT OF FUEL! YOU NEEDED" + (miles - c) + " MORE GALLON(S) OF FUEL!");
				}
			}
		}
	}
	public double reportFuel() {
		return fuel;
	}
}
