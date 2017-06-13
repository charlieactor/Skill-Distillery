import java.util.*;
public class DeafGrandma {
  public static void main( String[] args ) {
      response();
}


  public static void response() {
    Scanner keyboard = new Scanner(System.in);
    String input = "";
    String answersHeard [] = {"YOU'RE HIDEOUS!", "OH, GRANDMA!", "I LOVE EVERYTHING",
     "BITCHES!", "BEER", "I'M DRUNK", "YOU'RE DRUNK", "FML!", "SO LONELY", "ABRACADABRA!"
     };
    String answersNotHeard [] = {"YOU'RE BEAUTIFUL!", "OH, GRANDPA", "I HATE EVERYTHING",
     "HOES", "LIQUOR", "I'M SOBER", "YOU'RE SOBER", "YOLO", "SO POPULAR", "RAZZLEDAZZLE"};

    do { input = "";
      int math = (int)(Math.random()*9);
      System.out.println("Please ask Grandma something: ");
    input += keyboard.nextLine();

      if (!input.equals(input.toUpperCase())) {
      System.out.println(answersNotHeard[math]);
    }
    else if (input.equals(input.toUpperCase()) && (!input.equals("GOODBYE"))) {
      System.out.println(answersHeard[math]);
    }
  }
    while(!input.equals("GOODBYE"));
      System.out.println("SMELL YOU LATER!");

  }
}
