package by.company.kaliaha.task3;

import by.company.kaliaha.utility.IncorrectParameterInputException;
import by.company.kaliaha.utility.Rounder;

public class LogicTask3 {
	public LogicTask3() {}

	public double calculateRatioAreas(double area) throws IncorrectParameterInputException {
		if (area <= 0) {
			throw new IncorrectParameterInputException("Area must be positive number");
		}

		double radiusCircle = Math.sqrt(area) / 2;
		double areaSquare = 2 * Math.pow(radiusCircle, 2);
		double ratio = Rounder.roundNumber(area / areaSquare, 3);
		return ratio;
	}
}