public class TenOdds {
  public static void main(String[] args) {
    int ten[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    int i;
    String odds = "";
    for (i = 0 ; i < ten.length ; i++) {
      odds += ten[i] + " ";
    }
    System.out.println(odds);
  }
}
