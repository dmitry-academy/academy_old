package by.academy.lesson12.exceptions.custom;

public class CustomException2 extends CustomException1 {
	private static final long serialVersionUID = -3539861793776429512L;

	public CustomException2() {
		super();
	}

	public CustomException2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CustomException2(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException2(String message) {
		super(message);
	}

	public CustomException2(Throwable cause) {
		super(cause);
	}

}
