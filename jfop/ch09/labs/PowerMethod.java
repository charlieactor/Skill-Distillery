import java.util.Scanner;

public class PowerMethod {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double base, result;
    int exponent;

    System.out.print("Please enter a base number: ");
    base = keyboard.nextDouble();
    System.out.print("\nPlease enter an exponent: ");
    exponent = keyboard.nextInt();

    result = power(base, exponent);
    System.out.println(result);
  }
  public static double power(double base, int exponent) {
    double answer = 1;
    for (int i = 0; i < exponent; i++){
      answer = answer * base;
    }
    return answer;
    //OR you could just use Math.pow!:

    // return Math.pow(base, exponent);
  }
}
