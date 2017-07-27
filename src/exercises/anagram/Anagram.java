package exercises.anagram;

public interface Anagram {
	
	public void setPair(String anagramOne, String anagramTwo);			//sets the pair to compare for the anagram
	public String[] getPair();											//gets the values that are present
	public Boolean comparePair(String anagramOne, String anagramTwo);	//compares two strings and determines if they are an anagram
		
}
