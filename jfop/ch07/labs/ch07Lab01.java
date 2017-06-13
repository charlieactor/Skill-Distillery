import java.util.Scanner;

public class ch07Lab01{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int number;

    System.out.print("Please input an integer - positive or negative: ");
    number = keyboard.nextInt();

    if (number > 0){
      System.out.println(number + " is positive.");
    }
    else if (number == 0) {
      System.out.println(number + " is zero!");
    }
    else {
      System.out.println(number + " is negative!");
    }
  }
}
