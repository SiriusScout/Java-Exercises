package exercises.numberformatexception;

public class ValuesOutOfRangeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ValuesOutOfRangeException() {
		super("VALUE OUT OF RANGE");
	}
	
	public ValuesOutOfRangeException(String message) {
		super(message);
	}
	
	public ValuesOutOfRangeException(Throwable cause) {
		super(cause);
	}
	
	public ValuesOutOfRangeException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
