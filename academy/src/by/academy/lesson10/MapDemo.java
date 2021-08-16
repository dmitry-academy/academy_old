package by.academy.lesson10;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String... args) {
		Map<String, Integer> petiasApple = new HashMap<>();

		petiasApple.put("krasnie", 10);
		petiasApple.put("zelenie", 15);

		petiasApple.put("krasnie", petiasApple.get("krasnie") - 2);
		petiasApple.remove("zelenie");
		for (String key : petiasApple.keySet()) {
			petiasApple.compute(key, (k, v) -> v + 1);

			Integer appleNum = petiasApple.get(key);
			System.out.println("Y peti " + key + " " + "iablok:" + appleNum);
		}
	}
}
