package exercises.phone;

public class NexusImp implements Phone, Nexus{
	private String modelNumber;
	private int screenWidth;
	private int screenHeight;
	private String operatingSystem;
	
	//GETTERS AND SETTERS --------------------------------------
	//model number
	public void setModelNumber(String value) {
		modelNumber = value;
	}
	
	public String getModelNumber() {
		return modelNumber;
	}
	
	//resolution
	public void setScreenResolution(int width, int height) {
		screenWidth = width;
		screenHeight = height;
	}
	
	public int getScreenWidth() {
		return screenWidth;
	}
	
	public int getScreenHeight() {
		return screenHeight;
	}
	
	//operating system
	public void setOperatingSystem(String value) {
		operatingSystem = value;
	}
	
	public String getOperatingSystem() {
		return operatingSystem;
	}
	
	public void printConfig() {
		
	}
	
	public void qualityCheck() {
		
	}
}
