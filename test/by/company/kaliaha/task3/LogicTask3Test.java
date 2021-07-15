package by.company.kaliaha.task3;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task3.LogicTask3;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask3Test {
	@Test
	public void calculateRatioAreasTest_Positive_Number() throws IncorrectParameterInputException{
		LogicTask3 logicTask3 = new LogicTask3();		
		double expected = 2;
		double actual = logicTask3.calculateRatioAreas(10);
		Assert.assertEquals(expected, actual, 0.00001);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateRatioAreasTest_Negative_Number() throws IncorrectParameterInputException{
		LogicTask3 logicTask3 = new LogicTask3();		
		double expected = 2;
		double actual = logicTask3.calculateRatioAreas(-10);
		Assert.assertEquals(expected, actual, 0.00001);
	}
}
