package by.academy.lesson5.stringappender;

public class AppenderTest {
	public static void main(String... args) {
		StringBuilder sb = new StringBuilder();
		int a = 34;
		int b = 54;
		sb.append(a).append(" + ").append(b).append(" = ").append(a + b);
		sb.append("\n\r");
		sb.append("tset");
		System.out.println(sb);
	}
}
