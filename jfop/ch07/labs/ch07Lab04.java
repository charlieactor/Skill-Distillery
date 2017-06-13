import java.util.Scanner;

public class ch07Lab04{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String s;
    char c;

    System.out.println("Please input one character of anything:");
    s = keyboard.next();
    s = s.toLowerCase();
    c = s.charAt(0);

    // if (c >= '0' && c <= '9'){
    //       System.out.println(s + " is a number.");
    //   }
    // else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
    //       System.out.println(s + " is a vowel.");
    // }
    // else if (c >= 'a' && c <= 'z'){
    //           System.out.println(s + " is a consonant.");
    //         }
    // else {
    //   System.out.println(s + " is a non-alphanumeric character.");
    // }


    switch(c) {
      case 'a': case 'e': case 'i': case 'o': case 'u':
        System.out.println(s + " is a vowel!");
        break;

      case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8':
      case '9': case '0':
        System.out.println(s + " is a number!");
        break;
    
      default:
        System.out.println(s + " is a consonant.");
    }
  }
}
