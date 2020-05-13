package by.academy.lesson11;

import java.util.HashMap;
import java.util.Map;

public class DemoException {

	private static Map<String, Integer> userMoney = new HashMap<String, Integer>();

	static {
		userMoney.put("Petia", 1000);
		userMoney.put("Vasia", 500);
	}

	public static void main(String... args) throws CustomException {
		service();
	}

	public static void service() throws CustomException {
		String tr = "transaction info";
		dao("Petia", 999);
		dao("Vasia", 999);

	}

	public static void dao(String name, Integer money) throws CustomException {
		if (userMoney.get(name) < money) {
			throw new CustomException(name + " not enough money " + money);
		}
		userMoney.put(name, userMoney.get(name) - money);
	}
}
