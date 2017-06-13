import java.util.Scanner;

public class PointDistance {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x1, y1, x2, y2, distance;

    System.out.println("Please enter the x and y value of your first point: ");
    System.out.print("x: ");
    x1 = keyboard.nextDouble();
    System.out.print("\ny: ");
    y1 = keyboard.nextDouble();

    System.out.println("Please enter the x and y value of your second point: ");
    System.out.print("x: ");
    x2 = keyboard.nextDouble();
    System.out.print("\ny: ");
    y2 = keyboard.nextDouble();

    distance = findDistance(x1, y1, x2, y2);

    System.out.println("The distance between " + x1 + " " + y1 + " and " + x2 +
    " " + y2 + " is " + distance);
  }
  public static double findDistance(double x1, double  y1, double x2, double y2) {
    return Math.sqrt(PowerMethod.power((x1 - x2), 2) + PowerMethod.power((y1 - y2), 2));
  }
}
