package labs;

import java.util.*;

public class Students {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names = printStudents();
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	
	}

	public Students() {

	}
	
	public static List<String> printStudents() {
		List<String> students = new ArrayList<>();

		students.add("Charlie Actor");
		students.add("Conor Gibson");
		students.add("Travis Way");
		students.add("Michael Maldonado");
		students.add("Moses Lee");
		students.add("Bryan Roberson");
		students.add("Andy Wynyard");
		students.add("Jake Paul");
		students.add("Jake Wood");

		return students;
	}
}
