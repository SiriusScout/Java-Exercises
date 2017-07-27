package exercises.namegame;

public class NameGameImp implements NameGame{
	private String sentence;
	private StringBuilder personOne;
	private StringBuilder personTwo;
	private StringBuilder personOneAndTwo;
	
	NameGameImp(){	
		personOne = new StringBuilder();
		personTwo = new StringBuilder();
		personOneAndTwo = new StringBuilder();
	}
	
	private boolean isMonotonous(String person) {
		for(int index=0; index<person.length()-1; index++) {
			if(person.charAt(index) != person.charAt(index+1)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isPalindrome(String person) {
		int forIndex = 0;
		for(int index=person.length()-1; index > 0; index--) {
			if(person.charAt(index) != person.charAt(forIndex)){
				return false;
			}
			forIndex++;
			if(index <= forIndex)
				return true;
		}
		return true;
	}
	
	public void setSentence(String value) {
		sentence = value;
	}
	
	public String getSentence() {
		return sentence;
	}
	
	public void parseString() {
		//split the sentence into its individual pieces
		if(sentence == null)
		{
			
		}
		else {
			String splitter[] = sentence.split("\"");
			int count = 0;
			
			//gets the first name
			personOne.append(splitter[1]);
			//gets the second name
			if(splitter[3] != null) {
				personTwo.append(splitter[3]);
			}
			
			//splits the first name to get the first letters of each name
			splitter = personOne.toString().split(" ");
			for(String splitElem : splitter) {
				personOne.insert(count++,splitElem.charAt(0));
			}
			personOne.insert(count,".");
			
			count = 0;
			
			//splits the second name to get the first letters of each name
			if(personTwo != null) {
				splitter = personTwo.toString().split(" ");
				for(String splitElem : splitter) {
					personTwo.insert(count++,splitElem.charAt(0));
				}
				personTwo.insert(count, ".");
			}
		}
	}
	
	public void formSentence() {
		String initialsOne[] = personOne.toString().split("\\.");
		String initialsTwo[] = {};
		String s1 = getStatus(initialsOne[0]);
		String s2 = "";
		
		personOne.append(" is ");
		personOne.append(s1);
		
		if(personTwo != null) {
			initialsTwo = personTwo.toString().split("\\.");
			personTwo.append(" is ");
			s2= getStatus(initialsTwo[0]);
			personTwo.append(s2);
			personOneAndTwo.append("Both are ").append(compareStatus(initialsOne[0],initialsTwo[0],s1,s2));
		}
	}
	
	public void printSentence() {
		System.out.println(personOne.toString());
		System.out.println(personTwo.toString());
		System.out.println(personOneAndTwo.toString());
	}
	
	public String getStatus(String person) {
		if(isMonotonous(person)){
			return "Monotonous";
		}
		else if(isPalindrome(person)){
			return "Palonomic";
		}
		else {
			return "No-One";
		}
	}
	
	public String compareStatus(String p1, String p2, String s1, String s2) {
		String returnString = "Nothing";
		if(p1.equals(p2)) {
			if(s1.equals("Monotonous") && s2.equals("Monotonous")) {
				return "Monotonous-Twins";
			}
			else if(s1 == "Palonomic" && s2=="Palonomic") {
				return "Palonomic-Twins";
			}
			return "Twins";
		}
		return "Nothing";
	}

}
