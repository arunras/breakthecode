//package idsa;

import java.util.Arrays;

public class BubbleSort {

  public static int[] sortBubble(int[] A) {
    int a, b, temp;
    for (int i = 0; i < A.length-1; i++) {
      for (int j = 0; j < A.length-1-i; j++) {
        if (A[j] > A[j+1]) {
          temp = A[j+1];
          A[j+1] = A[j];
          A[j] = temp;
        }
      } 
    }
    return A;
  }

  public static void main (String[] args) {
    int[] A = {8, 5, 9, 2, 4, 6, 3, 7, 1};
    System.out.println("Result: " + Arrays.toString(sortBubble(A)));  
  }

}
