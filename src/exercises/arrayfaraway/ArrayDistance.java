package exercises.arrayfaraway;

import java.util.List;

/*Implement a Java function that finds two neighbouring numbers in an array
 * with the smallest distance to each other. The function should return the 
 * index of the first number. In the sequence 4 8 6 1 2 9 4 the minimum distance
 * is 1 (between 1 and 2). The function should return the index 3 (of number 1).
 */
public class ArrayDistance {
	
	ArrayDistance(){
		
	}
	
	public Integer getArrayDistanceIndex(List<Integer> array) {
		Integer resultIndex = 0;
		Integer smallestVal = 99999;
		Integer currentVal = 0;
		
		for(int index=0; index<array.size()-1; index++) {
			currentVal = Math.abs(array.get(index) - array.get(index+1));
			if(currentVal < smallestVal) {
				smallestVal = currentVal;
				resultIndex = index;
			}
		}
		
		return resultIndex;
	}

}
