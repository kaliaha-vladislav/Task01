package by.company.kaliaha.task8;

import by.company.kaliaha.utility.EntryValidator;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class RunnerForTask8 {
	public static void main(String[] args) throws IncorrectParameterInputException {
		EntryValidator entryValidator = new EntryValidator();
		LogicTask8 logicTask8 = new LogicTask8();
		double x = entryValidator.inputDouble("Please enter x:");

		double functionResult = logicTask8.calculateFunctionValue(x);
		System.out.println(functionResult);		
	}
}