package by.company.kaliaha.task7;

import by.company.kaliaha.utility.EntryValidator;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class RunnerForTask7 {
	public static void main(String[] args) throws IncorrectParameterInputException {
		EntryValidator entryValidator = new EntryValidator();
		Point A = new Point(entryValidator.inputInt("Please enter the x coordinate of point A:"), 
							entryValidator.inputInt("Please enter the y coordinate of point A:"));								
		Point B = new Point(entryValidator.inputInt("Please enter the x coordinate of point B:"), 
							entryValidator.inputInt("Please enter the y coordinate of point B:"));		

		Service service = new Service();
		Point nearestPoint = service.findNearestToOrigin(A, B);
		System.out.println("The nearest point is " + nearestPoint.toString());	
	}
}