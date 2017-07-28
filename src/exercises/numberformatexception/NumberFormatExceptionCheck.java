package exercises.numberformatexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormatExceptionCheck {
	
	public static void main(String[] args) {
		Boolean complete = false;
		Scanner reader = new Scanner(System.in);
		Double num = 0.0;
		String numStr = "";
		
		//keeps looping until a q is put for quit
		while(!complete) {
			try {
				//user input
				System.out.print(" Number: ");
				numStr = reader.next();
				
				//String to Double
				num = Double.parseDouble(numStr);
				
				if(num < 0)
					throw new NegativeValueException();
				
				if(num > 100)
					throw new ValuesOutOfRangeException();
				
				System.out.println(num);
				complete = true;
			}
			catch(NumberFormatException numFormatEx) {
				numFormatEx.printStackTrace();
			}
			catch(InputMismatchException mismatchEX) {
				mismatchEX.printStackTrace();
			}
			catch(NegativeValueException negativeEx){
				negativeEx.printStackTrace();
			}
			catch(ValuesOutOfRangeException outOfRangeEx) {
				outOfRangeEx.printStackTrace();
			}
			finally {
				num = 0.0;
				numStr = "";
			}
		}
		
		reader.close();
	}

}
