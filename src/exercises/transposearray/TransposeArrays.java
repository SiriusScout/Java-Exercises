package exercises.transposearray;

public class TransposeArrays {
	int n = 10;
	int numArray[][];

	TransposeArrays(int arrayAmount){
		n=arrayAmount;
	}
	
	public void fillArray() {
		numArray = new int[n][n];
		
		for(int x=0; x<n; x++) {
			for(int y=0; y<n; y++) {
				numArray[x][y] = x;
			}
		}
	}
	
	public int[][] getArray(){
		return numArray;
	}
	
	public int[][] transpose(){
		int tempNumArray[][] = new int[n][n];
		
		for(int x=0; x<n; x++) {
			for(int y=0; y<n; y++) {
				tempNumArray[x][y] = numArray[y][x];
			}
		}
		return tempNumArray;
	}

}
