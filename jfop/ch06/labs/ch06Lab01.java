import java.util.Scanner;

public class ch06Lab01{
  public static void main(String[] args){
    String output;
    output = printer();

  }
  public static String printer() {
    float radius;
    double circumference, area;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter your circle's radius: ");
    radius = keyboard.nextFloat();

    circumference = 2 * 3.14159 * radius;
    area = radius * radius * 3.14159;

    System.out.println("Radius = " + radius);
    System.out.println("Circumference = " + circumference);
    System.out.println("Area = " + area);
  }
}
