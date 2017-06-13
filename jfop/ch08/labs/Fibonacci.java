public class Fibonacci {
  public static void main(String [] args){
    int a = 0, b = 1, c;
    System.out.println(a);
    System.out.println(b);

    for(int i = 0; i < 18; i++){
      c = a + b;
      System.out.println(a + " + " + b + " = " + c);
      a = b;
      b = c;
    }
  }
}
