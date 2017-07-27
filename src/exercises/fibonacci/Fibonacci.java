package exercises.fibonacci;

import java.util.ArrayList;
import java.util.List;

//used to get the fibonacci sequence and average
public class Fibonacci {
	private List<Integer> fibNums;
	private int fn1=0,fn2=1,fn3=0;
	
	Fibonacci(){
		fibNums = new ArrayList<Integer>();
	}
	
	public void fibonacciNumber(Integer n) {
		if(n>0) {
			fn3 = fn1 + fn2;
			fn1 = fn2;
			fn2 = fn3;
			fibNums.add(fn3);
			fibonacciNumber(n-1);
		}
	}
	
	public List<Integer> getFibonacciNumbers(){
		return fibNums;
	}
	
	//gets the mean of the fibonacci numbers
	public Double getFibonacciMean() {
		double result = 0.0;
		
		if(!fibNums.isEmpty()) {
			for(Integer num : fibNums) {
				result += num;
			}
			result = result/(fibNums.size()+1);
		}
		
		return result;
	}
}
