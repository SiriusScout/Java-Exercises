package exercises.addingchars;

public class AddingChars {
	AddingChars(){
		
	}
	
	public long addCharArray(char[] cArray) {
		long result = 0;
		for(char num : cArray) {
			result += (num-48);
		}
		return result;
	}
}
