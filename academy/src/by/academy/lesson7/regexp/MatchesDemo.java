package by.academy.lesson7.regexp;

public class MatchesDemo {
	public static void main(String... args) {
		System.out.println("-20934".matches("-?[0-9]+"));
		String str = "Test     +string for split";
		String[] words = str.split(" \\+");
		System.out.println(str.replace(' ', 'a'));
		for (String word : words) {
			System.out.println(word + "	");
		}

	}
}
