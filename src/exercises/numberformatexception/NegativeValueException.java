package exercises.numberformatexception;

public class NegativeValueException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NegativeValueException() {
		super("NEGATIVE VALUE NOT ALLOWED");
	}
	
	public NegativeValueException(String message) {
		super(message);
	}
	
	public NegativeValueException(Throwable cause) {
		super(cause);
	}
	
	public NegativeValueException(String message, Throwable cause) {
		super(message, cause);
	}

}
