package by.company.kaliaha.task5;

import by.company.kaliaha.utility.EntryValidator;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class RunnerForTask5 {
	public static void main(String[] args) throws IncorrectParameterInputException {
		EntryValidator entryValidator = new EntryValidator();
		LogicTask5 logicTask5 = new LogicTask5() {};

		int number = entryValidator.inputPositiveInt("Please enter an integer: ");
		boolean result = logicTask5.isPerfectNumber(number);
		System.out.println(result);
	}
}