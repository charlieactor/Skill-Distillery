package com.skilldistillery.stringtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_chatAt_returns_character_at_index() {
		String testString = "abcde";
		assertEquals('a', testString.charAt(0));
		assertEquals('e', testString.charAt(4));
	}

	@Test
	public void test_chatAt_throw_index_out_of_bounds_exception_for_negative_or_not_less_than_length_of_String() {
		try{
			String testString = "abcde";
			testString.charAt(-1);
		}
		catch(IndexOutOfBoundsException ioobe){
			System.out.println(ioobe);
		}
		try{
			String testString = "abcde";
			testString.charAt(5);
		}
		catch(IndexOutOfBoundsException ioobe){
			System.out.println(ioobe);
		}
	}
	
	@Test
	public void test_concat_will_concatenate_two_strings() {
		String test1 = "abcde";
		String test2 = "fghij";
		assertEquals("abcdefghij", test1.concat(test2));
	}

	@Test
	public void test_ends_with_will_check_if_the_end_of_the_string_matches_the_input() {
		String testName = "Charlie";
		assertTrue(testName.endsWith("harlie"));
	}
	
	@Test
	public void test_index_of_will_return_the_first_instance_of_a_character_within_a_given_string() {
		String test = "abcdefgabc";
		assertEquals(1, test.indexOf('b'));
	}

	@Test
	public void test_is_empty_returns_true_if_string_is_empty() {
		String test = "not empty";
		assertFalse(test.isEmpty());
	}
	
	@Test
	public void test_last_index_of_returns_last_index_of_specified_character_within_a_string() {
		String test = "this is a test";
		assertEquals(12, test.lastIndexOf('s'));
	}

}
