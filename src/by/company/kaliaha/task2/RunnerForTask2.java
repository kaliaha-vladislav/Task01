package by.company.kaliaha.task2;

import by.company.kaliaha.utility.EntryValidator;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class RunnerForTask2 {
	public static void main(String[] args) throws IncorrectParameterInputException {
		EntryValidator entryValidator = new EntryValidator();
		LogicTask2 logicTask2 = new LogicTask2();
		int year = entryValidator.inputPositiveInt("Please enter the year");
		int month = entryValidator.inputPositiveInt("Please enter a month from 1 to 12: ", 12);	
		
		int numberDays = logicTask2.defineNumberDays(year, month);
		System.out.println("Number of days in this month: " + numberDays);
	}
}