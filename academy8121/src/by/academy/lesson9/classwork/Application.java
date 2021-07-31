package by.academy.lesson9.classwork;

public class Application {

	public static void main(String[] args) {

		YearTime[] values = YearTime.values();
		for (YearTime y : values) {
			System.out.println(y.getDescription());
			System.out.println(y.getAvgTemp());
		}

	}

	public static void print(YearTime yt) {
		System.out.println("Порядковый номер: " + yt.ordinal());
		System.out.println("Имя: " + yt.name());
	}

	public static void switchMethod(YearTime yt) {

		switch (yt) {
		case WINTER:
			System.out.println("Люблю Зиму");
			break;
		case SPRING:
			System.out.println("Люблю Весну");
			break;
		case SUMMER:
			System.out.println("Люблю Лето");
			break;
		case AUTUMN:
			System.out.println("Люблю Осень");
			break;
		default:
			System.out.println("???");
		}

	}

}
