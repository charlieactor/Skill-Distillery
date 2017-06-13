package examples;
import java.util.*;
public class SquareAndRootDebug {

    private static boolean debug;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        debug = true;
        if (debug == true)
            System.out.println("Debug: The program is starting.");

        double aNum = getNumber(true, scanner);
        while (true) {
            if (debug == true)
                System.out.println("Debug: In main, aNum: " + aNum);

            calcSquareAndRoot(aNum);
            aNum = getNumber(false, scanner);
        }
    }

    public static double getNumber(boolean firstTime, Scanner sc) {

        String theResp = null;
        double theNum = 0.0;
        if (debug == true) {
            System.out.println("Debug: Have entered the getNumber"
                    + " method.");
            System.out.println("Debug: Was passed theFirst: "
                    + firstTime);
        }

        if (firstTime == false) {
            System.out.print("Would you like to do another? (y/n): ");
            theResp = sc.next();

            if (debug == true)
                System.out.println("Debug: In getNumber, theResp: "
                        + theResp);

            if (theResp.charAt(0) == 'n' || theResp.charAt(0) == 'N') {
                sc.close();
                System.exit(0);
            }
        }

        System.out.print("Please enter a number: ");
        theNum = sc.nextDouble();

        if (debug == true)
            System.out.println("Debug: In getNumber, theNum: "
                    + theNum);

        return theNum;
    }

    public static void calcSquareAndRoot(double theNum) {

        if (debug == true) {
            System.out.println("Debug: Have entered"
                    + " calcSquareAndSquareRoot method.");
            System.out.println("Debug: Was passed theNum: " + theNum);
        }

        System.out.println("You entered the number: " + theNum);
        System.out.println("\tThe square is: " + square(theNum));
        System.out.println("\tThe square root is: "
                + Math.sqrt(theNum));
    }

    public static double square(double x) {
        double result = 0.0;

        if (debug == true) {
            System.out.println("Debug: Have entered the square"
                    + " method.");
            System.out.println("Debug: Was passed x: " + x);
        }

        result = x * x;

        if (debug == true)
            System.out.println("Debug: In square, result: " + result);

        return result;
    }
}
