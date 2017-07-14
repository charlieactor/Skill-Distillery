package ocp.prep;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringAndSBTests {
	StringBuilder sb;

	@Before
	public void setUp() throws Exception {
		sb = new StringBuilder();
	}

	@After
	public void tearDown() throws Exception {
		sb = null;
	}

	@Test
	public void test_ensureCapacity_causes_capacity_to_enlarge() {
		int initCapacity = sb.capacity();
		sb.ensureCapacity(30);
		int endCapacity = sb.capacity();
		assertTrue(initCapacity < endCapacity);
	}
	@Test
	public void test_ensureCapacity_does_not_change_length() {
		int initLength = sb.length();
		sb.ensureCapacity(30);
		int endLength = sb.length();
		assertEquals(initLength, endLength);
	}
	@Test
	public void test_setLength_trims_to_length() {
		sb.append("hi");
		sb.setLength(sb.length());
		int endLength = sb.length();
		assertEquals(endLength, sb.length());
	}
	@Test
	public void test_setLength_sets_length_to_new_length(){
		sb.setLength(30);
		int endLength = sb.length();
		assertEquals(endLength, 30);
	}
	@Test
	public void test_setLength_sets_added_characters_to_\u0000(){
		sb.setLength(30);
		assertEquals(sb.charAt(25), '\u0000');
	}
	@Test
	public void test_substring_does_not_modify_sb_contents(){
		sb.append("0123456789");
		String returned = sb.substring(2, 5);
		assertEquals(sb.toString(), "0123456789");
	}
	@Test
	public void test_substring_throws_index_out_of_bounds_exception() {
		sb.append("012345");
		int i;
		try {
			sb.substring(3, 8);
			i = 12;
		} catch (IndexOutOfBoundsException ioobe) {
			i = 10;
		}
		assertEquals(i, 10);
	}
	@Test
	public void test_append_modifies_SB_contents() {
		sb.append("hi");
		assertEquals(sb.toString(), "hi");
	}
	@Test 
	public void test_append_returns_reference_to_original_SB_object() {
		sb.append("helloooo");
		StringBuilder sb2 = sb.append("there");
		assertEquals(sb2, sb);
	}
	@Test
	public void replace_modifies_SB_and_is_inclusive_exclusive(){
		sb.append("0123456789");
		sb.replace(2, 4, "WHOA");
		assertEquals(sb.toString(), "01WHOA456789");
	}
	@Test
	public void setCharAt_modifies_SB_and_is_zero_based() {
		sb.append("0123456789");
		sb.setCharAt(3, 'q');
		assertEquals(sb.toString(), "012q456789");
	}
	@Test
	public void concat_String_does_not_change_original_string() {
		String hi = "howdy";
		hi.concat(" partner");
		assertEquals(hi, "howdy");
	}
	@Test
	public void concat_creates_a_new_string(){
		String hi = "howdy";
		String newHi = hi.concat(" partner");
		assertNotEquals(newHi, hi);
	}
	@Test
	public void intern_returns_String_in_string_pool() {
		String hi = "Hello";
		String hello = hi.intern();
		assertTrue(hi == hello);
	}
	@Test
	public void substring_index_start_at_0() {
		String hi = "hello";
		String h = hi.substring(0, 1);
		assertEquals(h, "h");
	}
	@Test
	public void test_substring_returns_STRING_and_is_inclusive_exclusive() {
		String test = "abcdefg";
		String returned = test.substring(2,  5);
		assertEquals(returned, "cde");
	}
	@Test
	public void test_charAt_throws_indexOutOfBoundsException() {
		String hi = "012345";
		int t;
		try {
			hi.charAt(6);
			t = 1;
		} catch (IndexOutOfBoundsException ioobe) {
			t = 2;
		}
		assertEquals(t, 2);
	}
	@Test
	public void test_string_plusEquals_string_creates_new_string() {
		String hi = "hello";
		String hello = hi;
		hi += " ";
		assertNotEquals(hello, hi);
	}
	@Test
	public void test_static_valueOfInt_returns_String() {
		String test = "";
		test = test.valueOf(520);
		assertEquals(test, "520");
	}
}
