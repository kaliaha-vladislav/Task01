package by.company.kaliaha.task5;

import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask5 {
	public LogicTask5() {}
	
	public boolean isPerfectNumber (int number) throws IncorrectParameterInputException {
		if (number <= 0) {
			throw new IncorrectParameterInputException("Number must be positive int number");
		}
		
		int sum = 0;
		int divisor = 1;
		
		while (sum <= number && number != divisor) {
			if (number % divisor == 0) {
				sum += divisor;
			}	
			++divisor;
		}
		return number == sum;		
	}
}