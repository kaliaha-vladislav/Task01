package by.company.kaliaha.task10;

import java.util.HashMap;

import by.company.kaliaha.utility.EntryValidator;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class RunnerForTask10 {
	public static void main(String[] args) throws IncorrectParameterInputException {
		EntryValidator entryValidator = new EntryValidator();
		LogicTask10 logicTask10 = new LogicTask10();
		
		double a = entryValidator.inputDouble("Please enter a:");
		double b = entryValidator.inputDouble("Please enter b");
		double h = entryValidator.inputDouble("Please enter h");
		HashMap<Double, Double> map = logicTask10.fillMap(a, b, h);
		
		for(double key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}