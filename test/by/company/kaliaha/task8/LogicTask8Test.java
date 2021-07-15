package by.company.kaliaha.task8;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task8.LogicTask8;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask8Test {

	@Test
	public void calculateFunctionValueTest() throws IncorrectParameterInputException {
		LogicTask8 logicTask8 = new LogicTask8();		
		double expected = 0.5;
		double actual = logicTask8.calculateFunctionValue(2);
		Assert.assertEquals(expected, actual, 0.0001);
	}
}