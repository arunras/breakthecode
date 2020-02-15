// Link: https://www.hackerrank.com/challenges/2d-array/problem

package arrays;

import java.lang.Math;

public class HourGlassSum {

    public static int compute(int[][] a) {
      int max = -99999;
      for (int row = 0; row <= 3; row++) {
        for (int col = 0; col <= 3; col++) {
          int sum = 0;     
          sum += a[row][col];
          sum += a[row][col + 1];
          sum += a[row][col + 2];
          
          sum += a[row + 1][col + 1];

          sum += a[row + 2][col];
          sum += a[row + 2][col + 1];
          sum += a[row + 2][col + 2];

          max = Math.max(max, sum);
        }
      }
      return max;
    }

}
