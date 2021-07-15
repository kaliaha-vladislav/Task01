package by.company.kaliaha.task8;

import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask8 {	
	public LogicTask8() {}
	
	public double calculateFunctionValue (double x) throws IncorrectParameterInputException {
		if (Math.pow(x, 3) == 6) {
			String message = "x to the power of 3 should not equal 6, since division by 0 occurs";
			throw new IncorrectParameterInputException(message);
		}
		
		int condition = 3;
		double functionValue;
				
		if (x >= condition) {
			functionValue = -Math.pow(x, 2) + 3 * x + 9;
		} else {
			functionValue = 1 / (Math.pow(x, 3) - 6);
		}		
		return functionValue;
	}
}