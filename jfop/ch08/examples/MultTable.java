package examples;

public class MultTable {
    public static void main(String[] args) {
        int num = 0;
        int factor = 0;

        for (num = 1; num <= 10; num = num + 1) {
            for (factor = 1; factor <= 10; factor = factor + 1) {
                System.out.print((num * factor) + "\t");
            }
            System.out.println("");
        }
    }
}
