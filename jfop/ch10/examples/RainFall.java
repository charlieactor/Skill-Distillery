package examples;

import java.util.*;

public class RainFall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayNames[] = { "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday" };
        float rainFall[] = new float[7];
        float total = 0.0F;
        float average = 0.0F;
        int i = 0;

        for (i = 0; i < 7; i = i + 1) {
            System.out.print("Enter the rainfall level for "
                    + dayNames[i] + ": ");
            rainFall[i] = scanner.nextFloat();
        }
        scanner.close();

        for (i = 0; i < 7; i = i + 1)
            total = total + rainFall[i];

        average = total / 7;

        System.out.println("The total rainfall for the week was: "
                + total);
        System.out.println("The average rainfall for the week was: "
                + average);
    }
}
