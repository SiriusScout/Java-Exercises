package exercises.checkerboard;

public class CheckerBoard {
	public static void main(String[] args) {
		int n = 7;
		
		for(int x=0; x<n; x++) {
			for(int y=0; y<n; y++) {
				if(x % 2 == 0)
					System.out.print("#\t");
				else
					System.out.print("    #   ");
			}
			System.out.println();
		}
	}

}
