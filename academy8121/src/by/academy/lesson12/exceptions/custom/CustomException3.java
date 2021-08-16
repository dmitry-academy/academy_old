package by.academy.lesson12.exceptions.custom;

public class CustomException3 extends CustomException2 {
	private static final long serialVersionUID = -3539861793776429512L;

	public CustomException3() {
		super();
	}

	public CustomException3(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CustomException3(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException3(String message) {
		super(message);
	}

	public CustomException3(Throwable cause) {
		super(cause);
	}

}
