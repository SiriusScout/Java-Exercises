package exercises.shapes;

public class RectangleImp implements Shapes2D, Rectangle{
	private double length;
	private double width;
	
	RectangleImp(){
		length = 0;
		width = 0;
	}
	
	public void setLength(double len) {
		length = len;
	}
	
	public void setWidth(double wid) {
		width = wid;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return 2*length*width;
	}
}
