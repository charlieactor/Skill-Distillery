import java.util.Scanner;

public class ch07Lab02{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double number, convert;
    String scale;

    System.out.print("Please input the temperature: ");
    number = keyboard.nextDouble();
    System.out.print("\nPlease input the scale (C/F): ");
    scale = keyboard.next();

    if (scale.equals("C")){
      convert = (number * 1.8 + 32.0);
      System.out.println(number + " degrees celsius is " + convert + " degrees farenheit.");
    }
    else if (scale.equals("F")) {
      convert = ((number - 32.0) * .5556);
      System.out.println(number + " degrees fahrenheit is " + convert + " degrees celsius.");
    }
  }
}
