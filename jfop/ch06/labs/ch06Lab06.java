import java.util.Scanner;

public class ch06Lab06{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    float monRain, tuesRain, wedRain, thursRain, friRain, satRain, sunRain, totalRain, avgRain;

    System.out.print("Please enter the rainfall for Monday: ");
    monRain = keyboard.nextFloat();
    System.out.print("\nPlease enter the rainfall for Tuesday: ");
    tuesRain = keyboard.nextFloat();
    System.out.print("\nPlease enter the rainfall for Wednesday: ");
    wedRain = keyboard.nextFloat();
    System.out.print("\nPlease enter the rainfall for Thursday: ");
    thursRain = keyboard.nextFloat();
    System.out.print("\nPlease enter the rainfall for Friday: ");
    friRain = keyboard.nextFloat();
    System.out.print("\nPlease enter the rainfall for Saturday: ");
    satRain = keyboard.nextFloat();
    System.out.print("\nPlease enter the rainfall for Sunday: ");
    sunRain = keyboard.nextFloat();

    totalRain = monRain + tuesRain + wedRain + thursRain + friRain + satRain + sunRain;
    avgRain = (monRain + tuesRain + wedRain + thursRain + friRain + satRain + sunRain) / 7;

    System.out.println("\nRainfall for the week:");
    System.out.println("Monday: " + monRain + " inches of rain.");
    System.out.println("Tuesday: " + tuesRain + " inches of rain.");
    System.out.println("Wednesday: " + wedRain + " inches of rain.");
    System.out.println("Thursday: " + thursRain + " inches of rain.");
    System.out.println("Friday: " + friRain + " inches of rain.");
    System.out.println("Saturday: " + satRain + " inches of rain.");
    System.out.println("Sunday: " + sunRain + " inches of rain.");
    System.out.println("Total rainfall: " + totalRain + " inches of rain.");
    System.out.println("Average rainfall: " + avgRain + " inches of rain.");
  }
}
