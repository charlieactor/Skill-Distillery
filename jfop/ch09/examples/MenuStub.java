package examples;

public class MenuStub {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = null;

        while (true) {
            System.out.println("\nCalculator Menu");
            System.out.println("-----------------------------------");
            System.out.println(" (A)dd");
            System.out.println(" (S)ubtract");
            System.out.println(" (M)ultiply");
            System.out.println(" (D)ivide");
            System.out.println(" (Q)uit");
            System.out.print("\nYour choice: ");
            input = scanner.next();
            if (input.equals("Q") || input.equals("q"))
                break;

            switch (input.charAt(0)) {
            case 'a': case 'A':
                add();
                break;
            case 's': case 'S':
                subtract();
                break;
            case 'm': case 'M':
                multiply();
                break;
            case 'd': case 'D':
                divide();
                break;
            default:
                System.err.println("\nInvalid option.");
                break;
            }
        }
        scanner.close();
    }

    // Use method stubs until we get the menu looking and working right.
    public static void add() {
    }

    public static void subtract() {
    }

    public static void multiply() {
    }

    public static void divide() {
    }
}
