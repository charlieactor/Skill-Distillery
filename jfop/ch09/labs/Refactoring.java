import java.util.Scanner;

public class Refactoring{
  public static void main(String[] args){
    String output;
    output = circlePrinter();
    System.out.println(output);
  }

  public static String circlePrinter() {
    float radius;
    double circumference, area;
    Scanner keyboard = new Scanner(System.in);
    String circleProp;

    System.out.println("Please enter your circle's radius: ");
    radius = keyboard.nextFloat();

    circumference = 2 * 3.14159 * radius;
    area = radius * radius * 3.14159;

    circleProp = "Radius = " + radius + "\nCircumference = " + circumference +
                 "\nArea = " + area;
    return circleProp;
  }
}
