package exercises.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class FibonacciDriver {
	public static void main(String[] args) {
		Fibonacci fObj = new Fibonacci();
		List<Integer> fibNums = new ArrayList<Integer>();
		
		fObj.fibonacciNumber(19);
		fibNums = fObj.getFibonacciNumbers();
		
		for(Integer num : fibNums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		System.out.println("Mean: " + fObj.getFibonacciMean());
		
	}
}
