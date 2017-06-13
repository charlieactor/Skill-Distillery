package com.skilldistillery.calc;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {
	
	Calculator calc;
	

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calc = null;
	}

	@Test
	public void test_add_adds_two_numbers() {
		int expected = 15;
		int result = calc.add(9,  6);
		assertEquals(expected, result);
	}
	@Test
	public void test_subtract_subtracts_two_numbers() {
		int expected = 10;
		int result = calc.subtract(20,  10);
		assertEquals(expected, result);
	}
	
	@Test
	public void test_divideInts_divides_first_number_by_second_number_and_returns_whole_number_truncated() {
		int expected = 3;
		int result = calc.divideInts(10, 3);
		assertEquals(expected, result);
	}
	
	@Test(expected = CannotDoThatException.class)
	public void test_divideInts_throws_CannotDoThatException_when_arg2_equals_zero() {
		calc.divideInts(5, 0);
	}
	
	@Test
	public void test_multiply_multiplies_two_numbers() {
		int expected = 30;
		int result = calc.multiply(6, 5);
		assertEquals(expected, result);
	}
	
	@Test
	public void test_divide_double_divdes_first_number_by_second_number_with_decimals(){
		int expected = 30;
		int result = calc.multiply(6, 5);
		assertEquals(expected, result);
	}
	
	@Test
	public void testdivideIntsThrowsCannotDoThatExceptionWhenArg2EqualsZero() {
		try{
			calc.divideDouble(6, 0);
			fail("Should have thrown exception here");
		}
		catch(CannotDoThatException cdte){
			
		}
	}
	

}
