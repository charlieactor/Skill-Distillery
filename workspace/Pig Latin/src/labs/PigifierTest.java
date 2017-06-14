package labs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PigifierTest {

	public static EnglishToPigLatin translator = new EnglishToPigLatin();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_translator_for_proper_english_to_piglatin() {
		String [] stringArray = new String [1];
		stringArray[0] = "Hello"; 
		String expected = stringArray[0];
		expected = "elloHay ";
		
		assertEquals(expected, translator.interpret(stringArray).toString());
	}
	@Test
	public void test_translator_for_proper_english_to_piglatin_to_starts_with_two_consonants() {
		String [] stringArray = new String [1];
		stringArray[0]= "Chello"; 
		String expected = stringArray[0];
		expected = "elloChay ";
		
		assertEquals(expected, translator.interpret(stringArray).toString());
	}
	@Test
	public void test_translator_for_proper_english_to_piglatin_to_starts_with_two_vowels() {
		String [] stringArray = new String [1];
		stringArray[0]= "Aaron"; 
		String expected = stringArray[0];
		expected = "Aaronway ";
		
		assertEquals(expected, translator.interpret(stringArray).toString());
	}
	
}