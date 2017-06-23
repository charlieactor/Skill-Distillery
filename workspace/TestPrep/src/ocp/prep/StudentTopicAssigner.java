package ocp.prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentTopicAssigner {
	Scanner kb = new Scanner(System.in);
	Map<Student, List<String>> studly = new HashMap<>();
	List<String> topics = new ArrayList<>();

	public static void main(String[] args) {
		StudentTopicAssigner STR = new StudentTopicAssigner();
		STR.addStudents();
		STR.addTopics();
		STR.assignTopics(STR.studly, STR.topics);
		STR.printMap(STR.studly);

	}
	
	public void printMap(Map<Student, List<String>> studentMap) {
		Set<Student> keys = studentMap.keySet();
		Iterator<Student> it = keys.iterator();
		while (it.hasNext()) {
			Student nextStud = it.next();
			System.out.println();
			System.out.println("Studly student's Name: " + nextStud.getName());
			System.out.println(nextStud.getName() + "'s number of topics: " + studentMap.get(nextStud).size());
			System.out.println(nextStud.getName() + "'s topics list: " + studentMap.get(nextStud));
			System.out.println();
		}
	}
	
	public void assignTopics(Map<Student, List<String>> studentMap, List<String> topicsList) {
		List<String> tempTopics = new ArrayList<String>(topicsList);
		Set<Student> studentKeys = studentMap.keySet();
		List<Student> tempStudents = new ArrayList<Student>(studentKeys);
		Collections.shuffle(tempTopics);
		Collections.shuffle(tempStudents);
		int counter = 0;
		for (int i = 0; i < tempTopics.size(); i++) {
				if(counter!=tempStudents.size()){
				studly.get(tempStudents.get(counter)).add(tempTopics.get(i));
				counter++;
				}
				else{
					counter = 0;
					i -= 1;
				}
		}
		
	}
	
	public void addTopics() {
		System.out.print("Would you like to add a topic? Y/N ");
		String yesNo = kb.next().toLowerCase();
		do {
			if (yesNo.equals("y") || yesNo.equals("yes")) {
				System.out.println();
				System.out.print("Please enter a topic: ");
				String topic = kb.next();
				topics.add(topic);
				System.out.println();
				System.out.println("Would you like to add another topic? Y/N ");
				yesNo = kb.next().toLowerCase();
				
			}
			else{
				yesNo = "n";
			}
		} while (!yesNo.equals("n") && !yesNo.equals("no"));
	}

	public void addStudents() {
		System.out.print("Would you like to add a new student? Y/N ");
		String yesno = kb.next().toLowerCase();
		do {
			if (yesno.equals("y") || yesno.equals("yes")) {
				System.out.println();
				System.out.print("Please enter the student's name: ");
				String studentName = kb.next();
				Student a = new Student(studentName);
				studly.put(a, new ArrayList<String>());
				System.out.println();
				System.out.println("Would you like to add another student? Y/N ");
				yesno = kb.next().toLowerCase();
			} else {
				yesno = "n";
			}
		} while (!yesno.equals("n") && !yesno.equals("no"));
	}

	public Map<Student, List<String>> getStudly() {
		return studly;
	}

	public void setStudly(Map<Student, List<String>> studly) {
		this.studly = studly;
	}

}
