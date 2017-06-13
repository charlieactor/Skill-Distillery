import java.util.Scanner;

public class ch06Lab07{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String grade1, grade2, grade3, grade4, grade5;
    String student;

    System.out.print("Please enter student name: ");
    student = keyboard.next();
    System.out.println("\nPlease enter the first grade: ");
    grade1 = keyboard.next();
    System.out.println("\nPlease enter the second grade: ");
    grade2 = keyboard.next();
    System.out.println("\nPlease enter the third grade: ");
    grade3 = keyboard.next();
    System.out.println("\nPlease enter the fourth grade: ");
    grade4 = keyboard.next();
    System.out.println("\nPlease enter the fifth grade: ");
    grade5 = keyboard.next();

    System.out.println("Report card for " + student);
    System.out.println("Math: " + grade1);
    System.out.println("English: " + grade2);
    System.out.println("Science: " + grade3);
    System.out.println("Social Studies: " + grade4);
    System.out.println("Band: " + grade5);
  }
}
