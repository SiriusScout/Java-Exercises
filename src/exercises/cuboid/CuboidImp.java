package exercises.cuboid;

//this class takes a generic and uses it to get the volume of a cuboid
public class CuboidImp<T extends Number> implements Cuboid<T>{
	private T height;
	private T width;
	private T breadth;
	
	CuboidImp(){
		height = null;
		width = null;
		breadth = null;
	}

	@Override
	public void setWidth(T width) {
		this.width = width;
		
	}

	@Override
	public void setHeight(T height) {
		this.height = height;
	}

	@Override
	public void setBreadth(T breadth) {
		this.breadth = breadth;
		
	}

	@Override
	public T getWidth() {
		return width;
	}

	@Override
	public T getHeight() {
		return height;
	}

	@Override
	public T getBreadth() {
		return breadth;
	}
	
	@Override
	public String toString() {
		StringBuilder results = new StringBuilder();
		
		results.append(width.toString());
		results.append(" ");
		results.append(height.toString());
		results.append(" ");
		results.append(breadth.toString());
		
		return results.toString();
	}
	
	@Override
	public double getVolume() {
		return width.doubleValue()*height.doubleValue()*breadth.doubleValue();
	}

}
