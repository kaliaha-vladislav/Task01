package by.company.kaliaha.task9;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task9.LogicTask9;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask9Test {

	@Test
	public void calculateCircumferenceTest_Correct_Parameter() throws IncorrectParameterInputException {
		LogicTask9 logicTask9 = new LogicTask9();		
		double expected = 62.832;
		double actual = logicTask9.calculateCircumference(10);
		Assert.assertEquals(expected, actual, 0.0001);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateCircumferenceTest_Incorrect_Parameter() throws IncorrectParameterInputException {
		LogicTask9 logicTask9 = new LogicTask9();		
		double expected = 0;
		double actual = logicTask9.calculateCircumference(-10);
		Assert.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void calculateAreaOfCircleTest_Correct_Parameter() throws IncorrectParameterInputException {
		LogicTask9 logicTask9 = new LogicTask9();		
		double expected = 314.159;
		double actual = logicTask9.calculateAreaOfCircle(10);
		Assert.assertEquals(expected, actual, 0.0001);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateAreaOfCircleTest_Incorrect_Parameter() throws IncorrectParameterInputException {
		LogicTask9 logicTask9 = new LogicTask9();		
		double expected = 0;
		double actual = logicTask9.calculateAreaOfCircle(-10);
		Assert.assertEquals(expected, actual, 0.0001);
	}
}