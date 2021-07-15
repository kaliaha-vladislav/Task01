package by.company.kaliaha.task2;

public enum DayInMonth {
	January(31),
	February(28),
	March(31),
	April(30),
	May(31), 
	June(30),
	July(31),
	August(31),
	September(30),
	October(31),
	November(30),
	December(31);
	
	private static final int FOUR = 4;
	private static final int FOUR_HUNDRED = 400;
	private static final int ONE_HUNDRED = 100;
	private static final int countFebruryDaysInLeapYear = 29;
	
	private int countDay;
	
	private DayInMonth(int countDay) {
		this.countDay = countDay;
	}
	
	public int getCountDay(int year) {
		int countDay = 0;
		
		if(this == February) {
			countDay = calculateCountDayForFebruary(year);		
		} else {
			countDay = this.countDay;
		}
		return countDay;
	}
	
	private int calculateCountDayForFebruary(int year) {
		int countDay = this.countDay;
		if (year % FOUR_HUNDRED == 0 || year % ONE_HUNDRED != 0 && year % FOUR == 0) {
			countDay = countFebruryDaysInLeapYear;
		}
		return countDay;
	}
}