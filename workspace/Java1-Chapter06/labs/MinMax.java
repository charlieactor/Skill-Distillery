import java.util.Scanner;

public class MinMax{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int fiveNums[] = new int[5];


    for (int i = 0; i < fiveNums.length; i++) {
      System.out.println("Please enter a number: ");
      fiveNums[i] = keyboard.nextInt();
    }
    int small = fiveNums[0];
    int large = fiveNums[0];

    for (int num : fiveNums) {
      if (num < small) {
        small = num;
      }
      if (num > large) {
        large = num;
      }
    }
    System.out.println("smallest: " + small + "\tlargest: " + large);
  }
}
