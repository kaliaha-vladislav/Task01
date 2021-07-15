package by.company.kaliaha.task4;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task4.LogicTask4;

public class LogicTask4Test {
	@Test
	public void isMoreThanTwoEvenNumberTest_All_Positive() {
		LogicTask4 logicTask4 = new LogicTask4();		
		boolean expected = true;
		boolean actual = logicTask4.isMoreThanTwoEvenNumber(4, 6, 1, 8);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isMoreThanTwoEvenNumberTest_All_Negative() {
		LogicTask4 logicTask4 = new LogicTask4();		
		boolean expected = true;
		boolean actual = logicTask4.isMoreThanTwoEvenNumber(-4, -6, -1, -8);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isMoreThanTwoEvenNumberTest_All_Not_Even() {
		LogicTask4 logicTask4 = new LogicTask4();		
		boolean expected = false;
		boolean actual = logicTask4.isMoreThanTwoEvenNumber(1, 3, 5, 7);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void isMoreThanTwoEvenNumberTest_Two_Even() {
		LogicTask4 logicTask4 = new LogicTask4();		
		boolean expected = true;
		boolean actual = logicTask4.isMoreThanTwoEvenNumber(2, 4, 5, 7);
		Assert.assertEquals(expected, actual);
	}
}
