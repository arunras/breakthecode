package idsa;

public class TowerOfHanoi {
  private static int numOfMoves = 0;
  public void move(int numOfDiscs, char from, char to, char inter) {
    if (numOfDiscs == 1) {
      System.out.println(numOfMoves + ". Moving disc " + numOfDiscs + " from " + from + " to " + to);
      numOfMoves++;
    } else {
      move(numOfDiscs - 1, from, inter, to);
      System.out.println(numOfMoves + ". Moving disc " + numOfDiscs + " from " + from + " to " + to);
      numOfMoves++;
      move(numOfDiscs - 1, inter, to, from);
    }
  }

  public static void main(String[] args) {
    TowerOfHanoi toh = new TowerOfHanoi();
    toh.move(3, 'A', 'C', 'B');
    System.out.println("Number of Moves: " + numOfMoves);
  }
}
