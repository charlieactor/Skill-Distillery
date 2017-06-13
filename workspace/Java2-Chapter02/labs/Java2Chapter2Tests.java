package labs;

import java.util.ArrayList;

import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;


public class Java2Chapter2Tests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	Students sn;
	@Test
	public void test_printStudents_prints_students_in_order_of_seats() {
		List<String> students = new ArrayList<>();
		students = sn.printStudents();
		assertNotNull(students);
		assertEquals(students.get(0), "Charlie Actor");
		assertEquals(students.get(8), "Jake Wood");
		
	}

}
