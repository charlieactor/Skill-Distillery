package examples;

public class UsePerson {
    public static void main(String[] args) {
        Person p = null;
        String name = null;
        name = "Sally";
        int age = 800;

        try {
            p = new Person(name, age);
        }
        catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }
        catch (BadAgeException bae) {
        	System.err.println(bae.getMessage());
        }

        System.out.println(p);
    }
}
