package by.company.kaliaha.task1;

import org.junit.Test;

import by.company.kaliaha.task1.LogicTask1;

import org.junit.Assert;

public class LogicTask1Test {
	@Test
	public void erectInSquareTest_Positive_Number(){
		LogicTask1 logicTask1 = new LogicTask1();		
		int expected = 4;
		int actual = logicTask1.erectInSquare(2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void erectInSquareTest_Negative_Number(){
		LogicTask1 logicTask1 = new LogicTask1();		
		int expected = 4;
		int actual = logicTask1.erectInSquare(-2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateLastDigitTest_Positive_Number(){
		LogicTask1 logicTask1 = new LogicTask1();		
		int expected = 4;
		int actual = logicTask1.calculateLastDigit(654);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void calculateLastDigitTest_Negative_Number(){
		LogicTask1 logicTask1 = new LogicTask1();		
		int expected = 4;
		int actual = logicTask1.calculateLastDigit(-654);
		Assert.assertEquals(expected, actual);
	}
}