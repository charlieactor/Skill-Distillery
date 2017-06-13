import java.util.Scanner;

public class ch06Lab02{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double far, cel;

    System.out.println("Please enter a temperature in Farenheit: ");
    far = keyboard.nextInt();
    cel = (far - 32.0) * (5.0/9.0);

    System.out.println(far + " degrees in celsius: " + cel);
  }
}
