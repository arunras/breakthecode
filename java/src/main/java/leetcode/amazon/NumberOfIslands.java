// https://leetcode.com/problems/number-of-islands/
package leetcode.amazon;

public class NumberOfIslands {

  public static int find(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }

    int islands = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '1') {
          islands += dfs(grid, i, j);
        }
      }
    }
    return islands;
  }
  
  private static int dfs(char[][] ocean, int x, int y) {
    if (x < 0 || x >= ocean.length || y < 0 || y >= ocean[0].length || ocean[x][y] != '1') {
      return 0;
    }
    
    ocean[x][y] = '2';
    dfs(ocean, x - 1, y);
    dfs(ocean, x, y + 1);
    dfs(ocean, x + 1, y);
    dfs(ocean, x, y - 1);

    return 1;
  }

}
