package examples;

public class Interest1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double principal = 0.0;
        double rate = 0.0;
        double payment = 0.0;

        System.out.print("\nEnter the principal amount of the loan ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate for the loan ");
        rate = scanner.nextDouble();
        scanner.close();

        payment = (principal + 30 * principal * (rate / 100))
                / (30 * 12);

        System.out.println(
                "\nPrincipal\t\tInterest Rate\t\tMonthly Payment");

        System.out.println("---------\t\t-------------\t"
                + "\t---------------");

        System.out.println(principal + "\t\t\t" + rate + "\t\t\t"
                + payment);
        payment = (principal + 30 * principal * ((rate - .5) / 100))
                / (30 * 12);

        System.out.println(principal + "\t\t\t" + (rate - .5)
                + "\t\t\t" + payment);
        payment = (principal + 30 * principal * ((rate + .5) / 100))
                / (30 * 12);

        System.out.println(principal + "\t\t\t" + (rate + .5)
                + "\t\t\t" + payment);
    }
}
