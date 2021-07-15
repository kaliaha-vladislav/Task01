package by.company.kaliaha.task6;

import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask6 {
	public LogicTask6() {}
	
	private static final int SECONDS_IN_HOUR = 3600;
	private static final int SECONDS_IN_MINUTE = 60;
	private static final int MAX_SECONDS_IN_DAY = 86400;
	
	private void checkInputNumber(int numberOfSeconds) throws IncorrectParameterInputException {
		if (numberOfSeconds <  1 || numberOfSeconds > MAX_SECONDS_IN_DAY) 
			throw new IncorrectParameterInputException("Number of second must be from 1 to 86400");		
	}
	
	public int calculateWholeHours(int numberOfSeconds) throws IncorrectParameterInputException {
		checkInputNumber(numberOfSeconds);
		return numberOfSeconds / SECONDS_IN_HOUR;
	}
	
	public int calculateWholeMinutes(int numberOfSeconds) throws IncorrectParameterInputException {
		checkInputNumber(numberOfSeconds);
		int secondsWithoutHours = calculateSecondsWithoutHours(numberOfSeconds);
		return secondsWithoutHours / SECONDS_IN_MINUTE;
	}
	
	private int calculateSecondsWithoutHours(int numberOfSeconds) throws IncorrectParameterInputException {
		return numberOfSeconds - calculateWholeHours(numberOfSeconds) * SECONDS_IN_HOUR;
	}
	
	public int calculateRemainingSeconds(int numberOfSeconds) throws IncorrectParameterInputException {
		checkInputNumber(numberOfSeconds);
		int countOfSeconds = calculateSecondsWithoutHours(numberOfSeconds) - calculateWholeMinutes(numberOfSeconds) * SECONDS_IN_MINUTE;	
		return countOfSeconds;
	}
}