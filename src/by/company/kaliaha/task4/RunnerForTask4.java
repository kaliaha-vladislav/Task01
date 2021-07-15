package by.company.kaliaha.task4;

import by.company.kaliaha.utility.EntryValidator;

public class RunnerForTask4 {
	public static void main(String[] args) {
		EntryValidator entryValidator = new EntryValidator();
		LogicTask4 logicTask4 = new LogicTask4();
		
		int a = entryValidator.inputInt("Please enter the number A:");
		int b = entryValidator.inputInt("Please enter the number B:");
		int c = entryValidator.inputInt("Please enter the number C:");
		int d = entryValidator.inputInt("Please enter the number D:");		
		boolean result = logicTask4.isMoreThanTwoEvenNumber(a, b, c, d);
		System.out.println(result);
	}
}