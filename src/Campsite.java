import java.lang.Math;
public class Campsite {
	private double radius;
	Campsite(double r) {
		setRadius(r);
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.pow((Math.PI*radius), 2);
	}
	public double getPerimeter() {
		return (2*Math.PI*radius);
	}
}
