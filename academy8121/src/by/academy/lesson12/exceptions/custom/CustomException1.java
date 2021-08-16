package by.academy.lesson12.exceptions.custom;

public class CustomException1 extends CustomException {
	private static final long serialVersionUID = -3539861793776429512L;

	public CustomException1() {
		super();
	}

	public CustomException1(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CustomException1(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException1(String message) {
		super(message);
	}

	public CustomException1(Throwable cause) {
		super(cause);
	}

}
