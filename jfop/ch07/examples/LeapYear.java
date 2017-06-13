package examples;

public class LeapYear {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int year = 0;

        System.out.print("Please enter the current year: ");
        year = scanner.nextInt();
        scanner.close();

        switch (year % 4) {
        case 0:
            if (year % 100 == 0) {
                System.out.print(
                    "\"Century\" years aren't leap years.");
                if (year % 400 == 0) {
                    System.out.println(" ..unless divisible by 400.");
                    System.out.println(year + "'s a leap year!");
                } 
                else {
                    System.out.println("  " + year
                            + " isn't a leap year.");
                }
            } 
            else {
                System.out.println(year + " is a leap year!");
            }
            break;
        case 3:
            System.out.print("Next year is a leap year.  "); // Fall through...
        default:
            System.out.println(year + " isn't a leap year.");
            break;
        }
    }
}
