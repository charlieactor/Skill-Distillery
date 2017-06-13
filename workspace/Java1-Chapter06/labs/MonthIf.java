import java.util.Scanner;

public class MonthIf {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String month;

    System.out.print("Please enter a month: ");
    month = keyboard.next();

    switch (month) {
      case "February":
        System.out.println(month + " has 28 days (unless it's a leap year!)");
        break;
      case "April":
      case "June":
      case "September":
      case "November":
        System.out.println(month + " has 30 days");
        break;
      default:
        System.out.println(month + " has 31 days");
    }

    // if (month.equals("January") || month.equals("March") || month.equals("May")
    //     || month.equals("July") || month.equals("August") || month.equals("October")
    //     || month.equals("December")) {
    //       System.out.println(month + " has 31 days.");
    //     }
    // else if (month.equals("April") || month.equals("June") || month.equals("September")
    //         || month.equals("November")) {
    //           System.out.println(month + " has 30 days.");
    //         }
    // else {
    //   System.out.println(month + " has 28 days (unless it's a leap year!)");
    // }
  }
}
