package com.skilldistillery.calc;

public class Calculator {
	
	public Calculator() {
		
	}
	public int add(int i1, int i2) {
		return i1 + i2;
	}
	
	public int subtract(int i1, int i2) {
		return i1  - i2;
	}
	
	public int divideInts(int i1, int i2) {
		int result = -1;
		try {
			result = i1/i2;
		}
		catch(ArithmeticException e) {
			throw new CannotDoThatException(e);
		}
		return result;
	}
	
	public int multiply(int i1, int i2) {
		return i1 * i2;
	}
	public double divideDouble(double d1, double d2) {
		return -1.1;
	}

}
