package by.company.kaliaha.utility;

public class IncorrectParameterInputException extends Exception {
	private static final long serialVersionUID = 1L;

	public IncorrectParameterInputException () {
		super();
	}
	
	public IncorrectParameterInputException (String message) {
		super(message);
	}
	
	public IncorrectParameterInputException (String message, Throwable cause) {
		super(message, cause);
	}
	
	public IncorrectParameterInputException (Throwable cause) {
		super(cause);
	}
}
