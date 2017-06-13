public class TenFloats {
  public static void main(String [] args) {
    float tenFloaters [] = new float[10];
    int i, biggestI = 0;
    String print = "";
    double biggest = 0;

    for (i = 0; i < tenFloaters.length; i++) {
      tenFloaters[i] = (float)(1 + Math.random()*100);
      print += tenFloaters[i] + " ";
    }

    for (i = 0; i < tenFloaters.length; i++) {
      if (tenFloaters[i] > biggest) {
        biggest = tenFloaters[i];
        biggestI = i;
      }
    }
    System.out.println("The biggest number is: " + biggest + " at index: " + biggestI);
    System.out.println(print);
  }
}
