import java.util.Scanner;

public class ch06Lab03{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int i, j;
    System.out.print("Please enter a number: ");
    i = keyboard.nextInt();
    System.out.print("\nPlease enter another number: ");
    j = keyboard.nextInt();

    int nextMultiple = i + j - i % j;

    System.out.println(nextMultiple);
  }
}
