package by.company.kaliaha.task1;

public class LogicTask1 {
	public LogicTask1() {}
	
	public int erectInSquare (int number) {
		return (int)Math.pow(number, 2);
	}
	
	public int calculateLastDigit (int number) {			
		return Math.abs(number) % 10;
	}
}