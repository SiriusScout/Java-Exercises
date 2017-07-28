package exercises.numeratordivsor;

import java.util.Scanner;

//takes two user inputs for division
//checks to make sure not dividing by zero using try catch
public class NumeratorDivisor {
	public static void main(String[] args) {
		Boolean complete = false;
		Scanner reader = new Scanner(System.in);
		String numStr = "", denStr = "";
		Double num = 0.0, den = 0.0;
		
		//keeps looping until a q is put for quit
		while(!complete) {
			//user input
			System.out.print(" Numerator: ");
			numStr = reader.next();
			
			System.out.print(" Denominator: ");
			denStr = reader.next();
			
			//checking if quiting
			if(numStr.charAt(0) == 'q' || numStr.charAt(0) == 'Q') {
				complete = true;
				System.out.println("EXIT");
			}
			else {
				try {
					//string to double
					num = Double.parseDouble(numStr);
					den = Double.parseDouble(denStr);
					
					//checks for divisor of zero
					if(den == 0.0) {
						throw new IllegalArgumentException("Argument 'divisor' is 0");
					}
					
					System.out.println(num/den);
					
				}catch(IllegalArgumentException divideByZero) {
					divideByZero.printStackTrace();
				}finally {
					//defaulting values
					num = 0.0;
					den = 0.0;
					numStr = "";
					denStr = "";
					//reader.close();
				}
			}
		}
		
		reader.close();
	}
}
