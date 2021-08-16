package by.academy.lesson8.enumeration;

public enum Day {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

	private int dayNumber;

	private Day(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}
}
