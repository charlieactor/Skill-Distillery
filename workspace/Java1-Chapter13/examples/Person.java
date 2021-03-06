package examples;

public class Person {
    private String name;
    private int age;

    public Person(String n, int age) throws InvalidDataException, BadAgeException {
        if (n == null || n.equals("")) {
            throw new InvalidDataException();
        }
        name = n;
        if (age <= 0 || age >=120) {
        	throw new BadAgeException();
        }
        this.age = age;
    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
