package labs;

public class EmpTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Alan", "Smith", Title.ANALYST);
		emp1.setSalary(90000);
		emp1.setEmployeeID(2526);
		System.out.println(emp1);
		
		Employee emp2 = new Employee("Sally", "Yates", Title.THERAPIST);
		emp2.setSalary(91000);
		emp2.setEmployeeID(72559);
		System.out.println(emp2);
		
		Employee emp3 = new Employee();
		emp3.setSalary(0);
		emp3.setEmployeeID(0000);
		System.out.println(emp3);
		
		emp1.display();
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2.equals(emp3));
		System.out.println(emp2.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
	}
}
