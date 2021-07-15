package by.company.kaliaha.task3;

import by.company.kaliaha.utility.EntryValidator;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class RunnerForTask3 {
	public static void main(String[] args) throws IncorrectParameterInputException {
		EntryValidator entryValidator = new EntryValidator();
		LogicTask3 logicTask3 = new LogicTask3();
		
		double area = entryValidator.inputPositiveDouble("Please enter the area of the described square");	

		double ratio = logicTask3.calculateRatioAreas(area);
		System.out.println("At " + ratio + " times");
	}
}