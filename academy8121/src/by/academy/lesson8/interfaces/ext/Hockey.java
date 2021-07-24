package by.academy.lesson8.interfaces.ext;

public interface Hockey extends Sport {
	void homeGoalScored();

	void visitingGoalScored();

	void endOfPeriod(int period);

	void overtimePeriod(int ot);
}
