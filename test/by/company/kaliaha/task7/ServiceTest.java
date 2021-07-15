package by.company.kaliaha.task7;

import org.junit.Assert;
import org.junit.Test;

import by.company.kaliaha.task7.Point;
import by.company.kaliaha.task7.Service;
import by.company.kaliaha.utility.IncorrectParameterInputException;

public class ServiceTest {

	@Test
	public void calculateDistanceToOriginTest_Correct_Parametr() throws IncorrectParameterInputException {
		Service service = new Service();	
		Point point = new Point(3, 4);
		double expected = 5;
		double actual = service.calculateDistanceToOrigin(point);
		Assert.assertEquals(expected, actual, 0.0001);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void calculateDistanceToOriginTest_Null_Parametr() throws IncorrectParameterInputException {
		Service service = new Service();	
		double expected = 5;
		double actual = service.calculateDistanceToOrigin(null);
		Assert.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void findNearestToOriginTest_Correct_Parameter() throws IncorrectParameterInputException {
		Service service = new Service();	
		Point pointA = new Point(3, 4);
		Point pointB = new Point(6, 8);
		
		Point expected = pointA;
		Point actual = service.findNearestToOrigin(pointA, pointB);
		Assert.assertEquals(expected, actual);
	}
	
	@Test(expected = IncorrectParameterInputException.class)
	public void findNearestToOriginTest_InCorrect_Parameter() throws IncorrectParameterInputException {
		Service service = new Service();			
		Point expected = null;
		Point actual = service.findNearestToOrigin(null, null);
		Assert.assertEquals(expected, actual);
	}
}