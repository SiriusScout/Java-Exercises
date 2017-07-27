package exercises.shapes;

public class SphereImp implements Shapes3D, Sphere{
	private double radius;
	
	SphereImp(){
		radius = 0;
	}
	
	public void setRadius(double value) {
		radius = value;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getVolume() {
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}
	
	public double getSurfaceArea() {
		return 4 * Math.PI * Math.pow(radius,2);
	}
}
