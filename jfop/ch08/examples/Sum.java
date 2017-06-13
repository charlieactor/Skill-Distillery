package examples;

public class Sum {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int sum = 0;
        int number = 0;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        while (number != 0) {
            sum = sum + number;
            System.out.print("Enter another number (zero to quit): ");
            number = scanner.nextInt();
        }
        System.out.println("The total is: " + sum);
        scanner.close();
    }
}
