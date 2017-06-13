import java.util.Scanner;

public class StateCapital {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String entry, again;
    String stateNames[][] = {
      {"Utah", "Salt Lake City"},
      {"Colorado", "Denver"},
      {"California", "Sacramento"},
      {"Iowa", "Demoisne"},
      {"New York", "Albany"},
      {"Georgia", "Atlanta"},
      {"Idaho", "Boise"},
      {"Wyoming", "Cheyenne"},
      {"Missouri", "St. Louis"},
      {"Illinois", "Chicago"}
    };

    System.out.print("Type a state name to see it's capital: ");
    entry = keyboard.next();
    do {
      outer:
      for(int i = 0; i < stateNames.length; i++) {
        for(int q = 0; q < stateNames[i].length; q++) {
          if (entry.equals(stateNames[i][0])) {
            System.out.println(stateNames[i][q+1]);
            continue outer;
          }
        }
      }
      System.out.print("Would you like to go again (Y/N): ")
      again = keyboard.next();
      while (again.equals("Y") || again.equals("y"));
  }
}
