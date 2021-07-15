package by.company.kaliaha.task6;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task6.LogicTask6;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask6Test {
	@Test
	public void calculateWholeHoursTest_Positive_Seconds() throws IncorrectParameterInputException{
		LogicTask6 logicTask6 = new LogicTask6();		
		int expected = 2;
		int actual = logicTask6.calculateWholeHours(10_000);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateWholeHoursTest_Negative_Seconds() throws IncorrectParameterInputException{
		LogicTask6 logicTask6 = new LogicTask6();		
		int expected = 2;
		int actual = logicTask6.calculateWholeHours(-10_000);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateWholeHoursTest_More_Than_TwentyFourHours() throws IncorrectParameterInputException{
		LogicTask6 logicTask6 = new LogicTask6();		
		int expected = 2;
		int actual = logicTask6.calculateWholeHours(86450);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateWholeMinutesTest_Positive_Seconds() throws IncorrectParameterInputException{
		LogicTask6 logicTask6 = new LogicTask6();		
		int expected = 1;
		int actual = logicTask6.calculateWholeMinutes(80);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateWholeMinutesTest_Negative_Seconds() throws IncorrectParameterInputException{
		LogicTask6 logicTask6 = new LogicTask6();		
		int expected = 1;
		int actual = logicTask6.calculateWholeMinutes(-80);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateWholeMinutesTest_More_Than_TwentyFourHours() throws IncorrectParameterInputException{
		LogicTask6 logicTask6 = new LogicTask6();		
		int expected = 1;
		int actual = logicTask6.calculateWholeMinutes(86450);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateRemainingSecondsTest_Positive_Seconds() throws IncorrectParameterInputException{
		LogicTask6 logicTask6 = new LogicTask6();		
		int expected = 20;
		int actual = logicTask6.calculateRemainingSeconds(3680);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateRemainingSecondsTest_Negative_Seconds() throws IncorrectParameterInputException{
		LogicTask6 logicTask6 = new LogicTask6();		
		int expected = 20;
		int actual = logicTask6.calculateRemainingSeconds(-3680);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateRemainingSecondsTest_More_Than_TwentyFourHours() throws IncorrectParameterInputException{
		LogicTask6 logicTask6 = new LogicTask6();		
		int expected = 20;
		int actual = logicTask6.calculateRemainingSeconds(86450);
		Assert.assertEquals(expected, actual);
	}
}