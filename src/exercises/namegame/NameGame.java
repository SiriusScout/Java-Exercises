package exercises.namegame;

public interface NameGame {
	
	public void setSentence(String sentence);
	public String getSentence();
	
	public void parseString();
	public String getStatus(String stat);
	public String compareStatus(String p1, String p2, String s1, String s2);
	
}
