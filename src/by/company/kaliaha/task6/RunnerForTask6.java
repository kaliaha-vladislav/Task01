package by.company.kaliaha.task6;

import by.company.kaliaha.utility.EntryValidator;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class RunnerForTask6 {
	public static void main(String[] args) throws IncorrectParameterInputException {
		EntryValidator entryValidator = new EntryValidator();
		LogicTask6 logicTask6 = new LogicTask6();

		String message = "Please enter the number of seconds from 1 to 86400";
		int numberOfSeconds = entryValidator.inputPositiveInt(message, 86400);

		int countOfHours = logicTask6.calculateWholeHours(numberOfSeconds);
		int countOfMinutes = logicTask6.calculateWholeMinutes(numberOfSeconds);
		int countOfSeconds = logicTask6.calculateRemainingSeconds(numberOfSeconds);
		System.out.println(countOfHours + "h. " + countOfMinutes + "min. " + countOfSeconds + "sec.");
	}
}