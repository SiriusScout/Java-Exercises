package exercises.cuboid;

public interface Cuboid<T> {
	
	public void setWidth(T width);
	public void setHeight(T height);
	public void setBreadth(T breadth);
	
	public T getWidth();
	public T getHeight();
	public T getBreadth();
	
	public String toString();
	
	public double getVolume();

}
