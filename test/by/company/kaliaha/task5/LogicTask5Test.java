package by.company.kaliaha.task5;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task5.LogicTask5;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask5Test {
	@Test
	public void isPerfectNumberTest_Not_Perfect() throws IncorrectParameterInputException{
		LogicTask5 logicTask5 = new LogicTask5();		
		boolean expected = false;
		boolean actual = logicTask5.isPerfectNumber(10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isPerfectNumberTest_Perfect() throws IncorrectParameterInputException{
		LogicTask5 logicTask5 = new LogicTask5();		
		boolean expected = true;
		boolean actual = logicTask5.isPerfectNumber(28);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void isPerfectNumberTest_Negative_Number() throws IncorrectParameterInputException{
		LogicTask5 logicTask5 = new LogicTask5();		
		boolean expected = true;
		boolean actual = logicTask5.isPerfectNumber(-28);
		Assert.assertEquals(expected, actual);
	}
}
