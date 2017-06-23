package ocp.prep;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTopicsTests {
	StudentTopicAssigner testSTR;

	@Before
	public void setUp() throws Exception {
		testSTR = new StudentTopicAssigner();
		
	}

	@After
	public void tearDown() throws Exception {
		testSTR = new StudentTopicAssigner();
	}

	@Test
	public void test_that_new_student_is_created_and_added_to_map() {
		testSTR.addStudents();
		List<String> stringList = new ArrayList<>();
		assertEquals(null, testSTR.getStudly().get("Jake"));
		
	}

}
