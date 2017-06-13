import java.util.Scanner;

public class ch06Lab05{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int dividend, divisor;

    System.out.print("Please enter a number to divide: ");
    dividend = keyboard.nextInt();
    System.out.print("\nPlease enter a number by which to divide the previous number: ");
    divisor = keyboard.nextInt();
    if (divisor == 0){
      System.out.println("You can't divide by zero!!");
      return;
    }
    System.out.println(dividend + " divided by " + divisor + " equals " + (dividend/divisor));
  }
}
