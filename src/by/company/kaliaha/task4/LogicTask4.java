package by.company.kaliaha.task4;

public class LogicTask4 {
	public LogicTask4() {}
	
	private int checkEvenNmber (int number) {
		int remainderOfDivision = number % 2;
		int result = 0;
		if(remainderOfDivision == 0) {
			result = 1;
		}
		return result;
	}
	
	public boolean isMoreThanTwoEvenNumber (int a, int b, int c, int d) {
		int sum = checkEvenNmber(a) + checkEvenNmber(b) + checkEvenNmber(c) + checkEvenNmber(d);		
		return sum >= 2;
	}
}