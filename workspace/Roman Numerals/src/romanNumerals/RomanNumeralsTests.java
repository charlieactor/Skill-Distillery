package romanNumerals;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTests {
	RomanNumeralsTranslator translator;
	@Before
	public void setUp() throws Exception {
		translator = new RomanNumeralsTranslator();
	}

	@After
	public void tearDown() throws Exception {
		translator = null;
	}

	@Test
	public void test_translateNumToRomanNumeral_translates_a_number_less_than_10_to_roman_numerals() {
		StringBuilder expected = translator.translateNumToRomanNumeral(22);
		assertEquals("XXII", expected.toString());
	}

}
