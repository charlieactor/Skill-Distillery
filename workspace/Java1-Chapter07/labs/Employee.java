package labs;

public class Employee {
	private String firstName, lastName;
	private int employeeID;
	private double salary;
	private Title title;
	static int minimumWage = 50000, retirementAge = 65;
	
	public Employee(String fName, String lName, Title title) {
		setFirstName(fName);
		setLastName(lName);
		this.title = title;
	}
	public Employee() {
		this("J.", "Doe", Title.TOBIAS);
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", employeeID="
				+ employeeID + "\nTitle: " + title + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeID;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (int)salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeID != other.employeeID)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return (int)salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public static int getMinimumWage() {
		return minimumWage;
	}

	public static void setMinimumWage(int minimumWage) {
		Employee.minimumWage = minimumWage;
	}

	public static int getRetirementAge() {
		return retirementAge;
	}

	public static void setRetirementAge(int retirementAge) {
		Employee.retirementAge = retirementAge;
	}

	public void display() {
		System.out.println(firstName + " " + lastName + "\nSalary: " +
							salary + "\nEmployee ID: " + employeeID +
							"\nMinimum wage: " + minimumWage + "\nRetirement age: " 
							+ retirementAge);
		System.out.printf("Salary: %1$.2f%n", salary);
		System.out.println();

	}
}
