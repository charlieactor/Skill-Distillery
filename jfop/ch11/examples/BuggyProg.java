package examples;

public class BuggyProg {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int base, exponent, result;

        System.out.print("Please enter the number to be used as the base: ");
        base = scanner.nextInt();

        System.out.print("Please enter the number to be used as the exponent: ");
        exponent = scanner.nextInt();
        scanner.close();

        result = power(base, exponent);
        System.out.println(base + " to the " + exponent + " power is "
                + result);
    }

    public static double power(double base, int exponent) {
        int i, result;

        result = 0;
        for (i = 0; i < exponent; i = i + 1)
            result = base * base;

        return result;
    }
}
