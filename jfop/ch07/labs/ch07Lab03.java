import java.util.Scanner;

public class ch07Lab03{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double a, b;
    String operator;

    System.out.println("Please input two numbers:");
    a = keyboard.nextDouble();
    b = keyboard.nextDouble();

    System.out.println("Please enter a mathematical operator:");
    operator = keyboard.next();

    switch (operator) {
      case "*": System.out.println("The result of " + a + " * " + b + " is " + (a * b));
              break;
      case "/": System.out.println("The result of " + a + " / " + b + " is " + (a / b));
              break;
      case "+": System.out.println("The result of " + a + " + " + b + " is " + (a + b));
              break;
      case "-": System.out.println("The result of " + a + " - " + b + " is " + (a - b));
              break;
    }
  }
}
