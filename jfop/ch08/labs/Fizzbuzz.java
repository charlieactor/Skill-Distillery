public class Fizzbuzz{
  public static void main(String[] args) {
    int i;

    for (i = 1; i <= 100; i++) {
      // if ((i % 3 == 0) && (i % 5 == 0)) {
      //   System.out.println("Fizzbuzz!");
      // }
      // else if (i % 5 == 0) {
      //   System.out.println("buzz!");
      // }
      // else if (i % 3 == 0) {
      //   System.out.println("Fizz");
      // }
      // else {
      //   System.out.println(i);
      // }
      boolean multipleFound = false;
      if (i % 3 == 0) {
        System.out.print("Fizz");
        multipleFound = true;
      }
      if (i % 5 == 0) {
        System.out.print("Buzz");
        multipleFound = true;
      }
      if(!multipleFound) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
