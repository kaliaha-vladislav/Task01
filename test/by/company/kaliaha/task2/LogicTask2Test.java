package by.company.kaliaha.task2;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task2.LogicTask2;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask2Test {
	@Test(expected = IncorrectParameterInputException.class)
	public void defineNumberDaysTest_Negative_Year() throws IncorrectParameterInputException{
		LogicTask2 logicTask2 = new LogicTask2();		
		int expected = 0;
		int actual = logicTask2.defineNumberDays(-2000, 2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void defineNumberDaysTest_Leap_Year_First() throws IncorrectParameterInputException{
		LogicTask2 logicTask2 = new LogicTask2();		
		int expected = 29;
		int actual = logicTask2.defineNumberDays(2000, 2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void defineNumberDaysTest_Leap_Year_Second() throws IncorrectParameterInputException{
		LogicTask2 logicTask2 = new LogicTask2();		
		int expected = 29;
		int actual = logicTask2.defineNumberDays(2020, 2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void defineNumberDaysTest_Leap_Year_Third() throws IncorrectParameterInputException{
		LogicTask2 logicTask2 = new LogicTask2();		
		int expected = 28;
		int actual = logicTask2.defineNumberDays(210, 2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void defineNumberDaysTest_Negative_Month() throws IncorrectParameterInputException{
		LogicTask2 logicTask2 = new LogicTask2();		
		int expected = 0;
		int actual = logicTask2.defineNumberDays(2020, -2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void defineNumberDaysTest_Positive_Month_More_12() throws IncorrectParameterInputException{
		LogicTask2 logicTask2 = new LogicTask2();		
		int expected = 0;
		int actual = logicTask2.defineNumberDays(2020, 14);
		Assert.assertEquals(expected, actual);
	}
}
