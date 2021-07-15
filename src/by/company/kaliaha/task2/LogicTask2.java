package by.company.kaliaha.task2;

import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask2 {
	public LogicTask2() {}
		
	public int defineNumberDays (int year, int month) throws IncorrectParameterInputException {
		if (year <= 0) {
			throw new IncorrectParameterInputException("Year must be positive int number");
		}
		if (month < 1 || month > 12) {
			String message = "Month must be positive int number from 1 to 12";
			throw new IncorrectParameterInputException(message);
		}
		
		DayInMonth[] monthArray = DayInMonth.values();
		return monthArray[month - 1].getCountDay(year);		
	}
}