public class ShowMe {
  public static void main (String [] args) {
    System.out.println("Number of args: " + args.length);
    for (int index = 0; index < args.length ; index++) {
      System.out.println( "Argument: " + args[index] );
    }
  }
}
