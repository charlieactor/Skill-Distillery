package examples;

import java.util.*;

public class SquareAndRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aNum = getNumber(true, scanner);
        while (true) {
            calcSquareAndRoot(aNum);
            aNum = getNumber(false, scanner);
        }
    }

    public static double getNumber(boolean firstTime, Scanner sc) {

        String theResp = null;
        double theNum = 0.0;
        if (firstTime == false) {
            System.out.print("Would you like to do another? (y/n): ");
            theResp = sc.next();

            if (theResp.charAt(0) == 'n' || theResp.charAt(0) == 'N') {
                sc.close();
                System.exit(0);
            }
        }

        System.out.print("Please enter a number: ");
        theNum = sc.nextDouble();
        return theNum;
    }

    public static void calcSquareAndRoot(double theNum) {
        System.out.println("You entered the number: " + theNum);
        System.out.println("\tThe square of that number is: "
                + square(theNum));
        System.out.println("\tThe square root of that number"
                + " is: " + Math.sqrt(theNum));
    }

    public static double square(double x) {
        double result;
        result = x * x;
        return result;
    }
}
