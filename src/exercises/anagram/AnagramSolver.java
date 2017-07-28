package exercises.anagram;

import java.util.*;

//this program is meant to solve wheither or not two strings are anagrams of each other or not
public class AnagramSolver implements Anagram{
	private String anagramOne;
	private String anagramTwo;
	
	//constructor
	AnagramSolver(){
		anagramOne = "";
		anagramTwo = "";
	}

	//sets the pair
	@Override
	public void setPair(String anagramOne, String anagramTwo) {
		this.anagramOne = anagramOne;
		this.anagramTwo = anagramTwo;	
	}

	//returns two string values stored
	@Override
	public String[] getPair() {
		String anagramPair[] = {anagramOne,anagramTwo};
		return anagramPair;
	}
	
	//compares two strings that are sent through and returns true if they are an anagram, false if they are not
	@Override
	public Boolean comparePair(String anagramOne, String anagramTwo) {
		Boolean result = false;
		int trackingVal = 0;
		char anaArray[];
		Map<Character,Integer> anagramOneMap = new HashMap<Character,Integer>();
		Map<Character,Integer> anagramTwoMap = new HashMap<Character,Integer>();
		
		//goes through each character of the first word
		anaArray = anagramOne.toLowerCase().toCharArray();
		for(Character letter : anaArray) {
			if(Character.isAlphabetic(letter)) {						//checks to see if its a letter (ignores spaces and punctuation
				if(!anagramOneMap.containsKey(letter))					//if no value has been mapped yet
					trackingVal = 0;
				else
					trackingVal = anagramOneMap.get(letter);
				anagramOneMap.put(letter, ++trackingVal);				//increments the value for a given key (letter)
			}
		}
		
		//goes through each character of the second word
		anaArray = anagramTwo.toLowerCase().toCharArray();
		for(Character letter : anaArray) {
			if(Character.isAlphabetic(letter)) {
				if(!anagramTwoMap.containsKey(letter))
					trackingVal = 0;
				else
					trackingVal = anagramTwoMap.get(letter);
				anagramTwoMap.put(letter, ++trackingVal);
			}
		}
		
		if(anagramOneMap.equals(anagramTwoMap))
			result = true;
		else
			result = false;
		
		return result;
	}
}
