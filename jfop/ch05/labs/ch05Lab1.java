import java.util.Scanner;

public class ch05Lab1{
  public static void main(String [] args){
    //Prints out my initials in big letters.
    System.out.println("    CC  \tRRRRR   \t      AA      ");
    System.out.println("  C    C\tR   R   \t     A  A     ");
    System.out.println(" C      \tR   R   \t    A    A    ");
    System.out.println("C       \tRRRRR   \t   AAAAAAAA   ");
    System.out.println(" C      \tR    R  \t  A        A  ");
    System.out.println("  C    C\tR     R \t A          A ");
    System.out.println("   CCC  \tR      R\tA            A");
    System.out.println();
    

    //Prints out a house using my initials.
    System.out.println("                      AAAA  ");
    System.out.println("    RRRRRRRRRRRRRRRRR A  A  ");
    System.out.println("   R                  RA A  ");
    System.out.println("  R                     RA  ");
    System.out.println("CR   CCCC       CCCC      RA");
    System.out.println(" R   C  C AAAAA C  C      A ");
    System.out.println(" R   CCCC A   A CCCC      A ");
    System.out.println(" R        A  AA           R ");
    System.out.println(" R        A   A           R ");
    System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCC");


    //Prints out five variables, input by the user, with spaces, tabs, and on
    //new lines.
    Scanner keyboard = new Scanner(System.in);

    int a, b, c, d, e;

    System.out.println("Please input a whole number: ");
    a = keyboard.nextInt();
    System.out.println("Please input a second whole number: ");
    b = keyboard.nextInt();
    System.out.println("Please input a third whole number: ");
    c = keyboard.nextInt();
    System.out.println("Please input a fourth whole number: ");
    d = keyboard.nextInt();
    System.out.println("Please input a fifth whole number: ");
    e = keyboard.nextInt();

    System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);
    System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);

    //Asks user for a string, a float, and an integer, prints them out
    //with different spacing

    String code;
    float salary;
    int id;

    System.out.println("Please input your department code: ");
    code = keyboard.next();
    System.out.println("Please input your salary: ");
    salary = keyboard.nextFloat();
    System.out.println("Please input your employee ID number: ");
    id = keyboard.nextInt();

    System.out.println("Department: " + code + " Salary: $" + salary + " Employee ID#: " + id);
    System.out.println("Department: " + code + "\tSalary: $" + salary + "\tEmployee ID#: " + id);
    System.out.println("Department: " + code + "\nSalary: $" + salary + "\nEmployee ID#: " + id);

  }
}
