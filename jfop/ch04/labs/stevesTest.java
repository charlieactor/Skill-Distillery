public class stevesTest {
  public static void main(String[] args){
    int i = 15;
    int j = 16;

    int k = 17;
    int m = 18;
    System.out.println(i +  j + " " + k + m);
    //note the empty String that begins the next line
    System.out.println("" + i +  j + " " + k + m);
    System.out.println("" + (i+j) + " " + k + m + '\u0007' + "!!!");
  }
}
