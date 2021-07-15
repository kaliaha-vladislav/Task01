package by.company.kaliaha.task10;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task10.LogicTask10;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class LogicTask10Test {

	@Test
	public void fillMapTest_Correct_Parameter() throws IncorrectParameterInputException {
		LogicTask10 logicTask10 = new LogicTask10();		
		HashMap<Double, Double> expected = new HashMap<Double, Double>();
		expected.put(1.0, 1.557);
		expected.put(2.0, -2.185);
		expected.put(3.0, -0.143);
		expected.put(4.0, 1.158);	
		
		HashMap<Double, Double> actual = logicTask10.fillMap(1, 4, 1);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void fillMapTest_First_More_Second() throws IncorrectParameterInputException {
		LogicTask10 logicTask10 = new LogicTask10();		
		HashMap<Double, Double> expected = new HashMap<Double, Double>();
		expected.put(1.0, 1.557);
		expected.put(2.0, -2.185);
		expected.put(3.0, -0.143);
		expected.put(4.0, 1.158);	
		
		HashMap<Double, Double> actual = logicTask10.fillMap(4, 1, 1);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void fillMapTest_Third_Less_0() throws IncorrectParameterInputException {
		LogicTask10 logicTask10 = new LogicTask10();		
		HashMap<Double, Double> expected = new HashMap<Double, Double>();
		expected.put(1.0, 1.557);
		expected.put(2.0, -2.185);
		expected.put(3.0, -0.143);
		expected.put(4.0, 1.158);	
		
		HashMap<Double, Double> actual = logicTask10.fillMap(4, 1, -1);
		Assert.assertEquals(expected, actual);
	}

}
