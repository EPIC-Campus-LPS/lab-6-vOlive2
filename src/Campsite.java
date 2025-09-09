import java.lang.Math;
public class Campsite implements CampObject {
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
	@Override
	public double getArea() {
		return Math.pow((Math.PI*radius), 2);
	}
	@Override
	public double getPerimeter() {
		return (2*Math.PI*radius);
	}
}
