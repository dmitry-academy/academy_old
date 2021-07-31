package by.academy.lesson9.classwork;

public enum YearTime {
	WINTER(-20.0, "Холодное время года"), SPRING(14, "Теплое время года"), SUMMER(30, "Дождливое время года"),
	AUTUMN(10, "Дождливое время года");

	private double avgTemp;
	private String description;

	YearTime(double avgTemp, String description) {
		this.avgTemp = avgTemp;
		this.description = description;
	}

	public double getAvgTemp() {
		return avgTemp;
	}

	public String getDescription() {
		return description;
	}

}
