import java.lang.Math;
public class Trail implements CampObject {
	private double length;
	private double width;
	Trail(double l, double w) {
		setLength(l);
		setWidth(w);
	}
	public void setLength(double l) {
		length = l;
	}	
	public void setWidth(double w) {
		width = w;
	}
	public double getLength() {
		return length;
	}	
	public double getWidth() {
		return width;
	}
	@Override
	public double getArea() {
		return (length*width);
	}
	@Override
	public double getPerimeter() {
		return (length+width*2);
	}
}

