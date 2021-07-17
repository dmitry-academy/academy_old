package by.academy.lesson6.homework;

public class HomeTask2 {

//	Ввести n слов с консоли. 
//	Найти слово, в котором число различных символов минимально. 
//	Если таких слов несколько, найти первое из них.
	public void main(String... args) {
		String[] test = { "test", "aaats" };

		for (String s : test) {
			int currentCounter = 0;
			char[] arr = new char[128];
			for (char c : s.toCharArray()) {
				arr[c]++;
			}
			for(int c : arr) {
			}
		}
	}
}
