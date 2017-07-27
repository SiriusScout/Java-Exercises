package exercises.shapes;

public class SquareImp implements Shapes2D, Square{
	private double side;
	
	SquareImp(){
		side = 0;
	}
	
	public void setSide(double value) {
		side = value;
	}
	
	public double getSide() {
		return side;
	}
	
	public double getArea() {
		return side*side;
	}
	
	public double getPerimeter() {
		return side*side*side*side;
	}
}
