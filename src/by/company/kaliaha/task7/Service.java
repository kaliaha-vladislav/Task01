package by.company.kaliaha.task7;

import by.company.kaliaha.utility.IncorrectParameterInputException;

public class Service {
	public Service() {}

	public double calculateDistanceToOrigin(Point point) throws IncorrectParameterInputException {
		if (point == null) {
			throw new IncorrectParameterInputException("The point shouldn't be null");
		}
		return Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
	}

	public Point findNearestToOrigin(Point point1, Point point2) throws IncorrectParameterInputException {
		if (point1 == null || point2 == null) {
			throw new IncorrectParameterInputException("The point shouldn't be null");
		}

		double distanceToOriginPoint1 = calculateDistanceToOrigin(point1);
		double distanceToOriginPoint2 = calculateDistanceToOrigin(point2);

		Point nearestToOrigin = point1;
		if (distanceToOriginPoint1 > distanceToOriginPoint2) {
			nearestToOrigin = point2;
		}
		return nearestToOrigin;
	}
}