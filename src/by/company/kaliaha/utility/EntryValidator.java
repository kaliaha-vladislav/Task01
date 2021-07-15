package by.company.kaliaha.utility;

import java.util.Scanner;

public class EntryValidator {
	private static Scanner sc;
	
	public EntryValidator () {
		sc = new Scanner (System.in);
	}
		
	public int inputInt(String message) {	
		System.out.println(message);
		
	    while (!sc.hasNextInt()) {
	        System.out.println("That not an integer!" + '\n' + message);
	        sc.next();
	    }	    
	    return sc.nextInt();
	}

	public int inputPositiveInt(String message) {				
		int number;
		
		do {
		    number = inputInt(message + "(the number must be positive): ");
		} while (number <= 0);	
		return number;
	}

	public int inputPositiveInt(String message, int limitation) throws IncorrectParameterInputException {	
		if(limitation <= 0) {
			throw new IncorrectParameterInputException("limitation must be more than 0");
		}
		
		int number;
		
		do {
		    number = inputInt(message);
		} while (number <= 0 || number > limitation);		
		return number;
	}	

	public double inputDouble(String message) {
		System.out.println(message);
		
	    while (!sc.hasNextDouble()) {
	        System.out.println("That not a double!" + '\n' + message);
	        sc.next();
	    }	    
	    return sc.nextDouble();
	}

	public double inputPositiveDouble(String message) {				
		double number;
		
		do {
		    number = inputDouble(message + "(the number must be positive): ");
		} while (number <= 0);		
		return number;
	}
	
	public double inputPositiveDouble(String message, double limitation) throws IncorrectParameterInputException {		
		if(limitation <= 0) {
			throw new IncorrectParameterInputException("limitation must be more than 0");
		}
		
		double number;
		
		do {
		    number = inputDouble(message);
		} while (number <= 0 || number > limitation);
		return number;
	}
		
}
