import java.util.Scanner;

public class ch06Lab08{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double x1, y1, x2, y2;

    System.out.print("Please input x and y values of the upper left hand ");
    System.out.print("corner of your rectangle: ");
    x1 = keyboard.nextDouble();
    y1 = keyboard.nextDouble();

    System.out.print("Please input x and y values of the lower right hand ");
    System.out.print("corner of your rectangle: ");
    x2 = keyboard.nextDouble();
    y2 = keyboard.nextDouble();

    System.out.println("The area of your rectangle is " + ((x2 - x1) * (y1 - y2)));
  }
}
