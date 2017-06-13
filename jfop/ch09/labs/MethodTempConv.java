import java.util.Scanner;

public class MethodTempConv {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double temp;
    String scale, conversion;

    System.out.print("Please enter the temperature: ");
    temp = keyboard.nextDouble();
    System.out.print("\nPlease enter the scale (C/f): ");
    scale = keyboard.next();

    conversion = convertTo(temp, scale);
    System.out.println("The converted temperature is " + conversion);
  }

  public static String convertTo(double temp, String scale){
    if (scale.equals("c") || scale.equals("C")){
      double converted = temp * 1.8 + 32;
      return converted + " degrees Farenheit.";
    }
    else if (scale.equals("f") || scale.equals("F")){
      double converted = (temp - 32) / 1.8;
      return converted + " degrees celsius.";
    }
    else {
      return "That's not a scale!";
    }
  }
}
