package exercises.cuboid;

public class CuboidImpDriver {
	public static void main(String[] args) {
		CuboidImp<Integer> ciObj = new CuboidImp<Integer>();
		
		ciObj.setWidth(9);
		ciObj.setHeight(6);
		ciObj.setBreadth(3);
		System.out.println(ciObj.toString());
		System.out.println(ciObj.getVolume());
		
	}

}
