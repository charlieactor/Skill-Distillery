import java.util.Scanner;

public class MethodNextMult {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int i, j;

    System.out.print("Please enter a number: ");
    i = keyboard.nextInt();
    System.out.print("\nPlease enter a second number: ");
    j = keyboard.nextInt();

    System.out.print("The next largest multiple of " + i + " that is divisible by ");
    System.out.println(j + " is " + nextMult(i, j) + "\n");
  }
  public static int nextMult(int i, int j){
    int nextMultiple = i + j - i % j;
    return nextMultiple;
  }
}
