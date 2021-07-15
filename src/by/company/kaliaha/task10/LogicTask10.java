package by.company.kaliaha.task10;

import java.util.HashMap;

import by.company.kaliaha.utility.IncorrectParameterInputException;
import by.company.kaliaha.utility.Rounder;

public class LogicTask10 {	
	public LogicTask10() {}

	public HashMap<Double, Double> fillMap(double a, double b, double h) throws IncorrectParameterInputException {
		if (a > b) {
			throw new IncorrectParameterInputException("a must be less than b");
		}
		if (h <= 0) { 
			throw new IncorrectParameterInputException("h must be positive number");
		}
			
		HashMap<Double, Double> map = new HashMap<Double, Double>();
			
		for (double x = a; x <= b; x += h) {	
			double value = Rounder.roundNumber(Math.tan(x), 3);
			map.put(x, value);			
		}
		return map;
	}
}