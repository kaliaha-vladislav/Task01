package by.company.kaliaha.task9;

import by.company.kaliaha.utility.IncorrectParameterInputException;
import by.company.kaliaha.utility.Rounder;

public class LogicTask9 {
	public LogicTask9() {}
	
	public void checkInputNumber (double radius) throws IncorrectParameterInputException {
		if (radius <= 0) {
			throw new IncorrectParameterInputException("Radius must be positive number");
		} 					
	}
	
	public double calculateCircumference(double radius)	throws IncorrectParameterInputException {
		checkInputNumber(radius);
		double ñircumference = 2 * Math.PI * radius;		
		return Rounder.roundNumber(ñircumference, 3);
	}
	
	public double calculateAreaOfCircle(double radius) throws IncorrectParameterInputException {
		checkInputNumber(radius);
		double areaOfCircle = Math.PI * Math.pow(radius, 2);		
		return Rounder.roundNumber(areaOfCircle, 3);
	}
}