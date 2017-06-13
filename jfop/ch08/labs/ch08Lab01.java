public class ch08Lab01{
  public static void main(String[] args){
    int i, pow = 1;
    for(i = 1; i <= 16; i++){
      pow = pow * 2;
      System.out.println((2 * i) + " " + pow);
    }
  }
}
