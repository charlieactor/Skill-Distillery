public class Ttt {
  public static void main (String [] args) {
    char ttb [] [] = { {'X', 'X', 'X'},
                     {'O', 'O', 'O'},
                     {'X', 'X', 'X'}
                   };
    printBoard(ttb);
  }
  public static void printBoard(char array[][]) {
    int i, position = 0;
    for (i = 0; i < 3; i++) {
      int q;
      for (q = 0; q < 3; q++) {
        System.out.print("" + array[position][q] + " ");
      }
      position ++;
      System.out.println();
    }
  }
}
