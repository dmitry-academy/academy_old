package by.academy.lesson8.interfaces.ext;

public interface Football extends Sport, TVProgram {
	void homeTeamScored(int points);

	void visitingTeamScored(int points);

	void endOfQuarter(int quarter);
}
