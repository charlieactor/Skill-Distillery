import java.util.Scanner;

public class ch06Lab04{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double total, tip10, tip15, tip20;

    System.out.println("Please enter the check total: ");
    total = keyboard.nextDouble();
    tip10 = total * .1;
    tip15 = total * .15;
    tip20 = total * .2;

    System.out.println("10% tip: " + tip10);
    System.out.println("15% tip: " + tip15);
    System.out.println("20% tip: " + tip20);

  }
}
