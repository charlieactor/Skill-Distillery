package com.skilldistillery.web;

public class MathDaoImpl implements MathDao {

	@Override
	public double doMath(double num1, double num2, String math) {
		if (math.equalsIgnoreCase("add")) {
			return num1 + num2;
		}
		else if (math.equalsIgnoreCase("subtract")) {
			return num1 - num2;
		}
		else if (math.equalsIgnoreCase("multiply")) {
			return num1 * num2;
		}
		else {
			return num1 / num2;
		}
	}

}
