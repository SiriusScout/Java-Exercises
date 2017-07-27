package exercises.shapes;

//import java.math.*;

public class CircleImp implements Circle, Shapes2D{
	private double radius;
	
	CircleImp(){
		radius = 0;
	}
	
	public void setRadius(double value) {
		radius = value;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}
