package exercises.phone;

public interface Nexus {
	
	void setModelNumber(String value);
	String getModelNumber();
	
	void setScreenResolution(int width, int height);
	int getScreenWidth();
	int getScreenHeight();
	
	void setOperatingSystem(String os);
	String getOperatingSystem();

}
