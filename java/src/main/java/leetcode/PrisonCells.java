// https://leetcode.com/problems/prison-cells-after-n-days/

package leetcode;

public class PrisonCells {
	
	public static int[] prisonAfterNDays(int[] cells, int N) {
    for (int i = 0; i < N; i++) {
      cells = nextDayState(cells);
    }
    return cells;
  }
  
  public static int[] nextDayState(int[] cells) {
    int[] next = new int[cells.length];
    for (int i = 1; i < cells.length - 1; i++) {
      next[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
    }
    return next;
  }

}
