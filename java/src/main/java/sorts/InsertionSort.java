package sorts;

public class InsertionSort {

  // Approach1: Brute Force -> O(n2)
  public static int[] sort(int[] data) {
    for (int i=0; i<data.length-1; i++) {
      for (int j=i+1; j>0; j--) {
        if (data[j] < data[j-1]) {
          int temp = data[j-1];
          data[j-1] = data[j];
          data[j] = temp;
        }
      }
    }
    return data;
  }
  
}
