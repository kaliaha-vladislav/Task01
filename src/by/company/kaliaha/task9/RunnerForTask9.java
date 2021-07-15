package by.company.kaliaha.task9;

import by.company.kaliaha.utility.EntryValidator;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class RunnerForTask9 {
	public static void main(String[] args) throws IncorrectParameterInputException {
		EntryValidator entryValidator = new EntryValidator();
		LogicTask9 t = new LogicTask9();

		double radius = entryValidator.inputPositiveDouble("Please enter the radius");
		double circumference = t.calculateCircumference(radius);
		double areaOfCircle = t.calculateAreaOfCircle(radius);
		System.out.println("Circumference length:" + circumference);
		System.out.println("Area of a circle:" + areaOfCircle);
	}
}