package by.company.kaliaha.task1;

import by.company.kaliaha.utility.EntryValidator;

public class RunnerForTask1 {
	public static void main(String[] args) {	
		EntryValidator entryValidator = new EntryValidator();
		LogicTask1 logicTask1 = new LogicTask1();
		
		int number = entryValidator.inputInt("Please enter an integer: ");			
		int squareNumber = logicTask1.erectInSquare(number);
		int lastDigit = logicTask1.calculateLastDigit(squareNumber);
		System.out.println("The last digit of the square of this number: " + lastDigit);
	}
}