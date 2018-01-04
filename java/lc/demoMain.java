package lc;

import java.util.Arrays;

public class demoMain {

  public static void main (String[] args) {
    int[] A = new int[] {1, 3, 5, 7, 9};
    int target = 14;
    twoSumArray a = new twoSumArray();

    System.out.println("Result:" + Arrays.toString(a.twoSum(A, target)));
    
  } 
}
