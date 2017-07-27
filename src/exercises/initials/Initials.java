package exercises.initials;

//import java.util.ArrayList;
//import java.util.List;

//this class is used to find the name of a person and then get the users initials
public class Initials {
	
	Initials(){
		
	}
	
	public String getInitials(String fullName) {
		StringBuilder sbObj = new StringBuilder();
		String[] splitName = new String[10];
		
		splitName = fullName.split(" ");
		
		for(String word : splitName) {
			sbObj.append(word.charAt(0));
		}
		
		return sbObj.toString();
	}

}
