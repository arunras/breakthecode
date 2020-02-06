package sorts;

public class SelectionSort {

  //Approach1: Brute Force -> O(n2)
  public static int[] selectionSort(int[] data) {
    for (int i=0; i<data.length-1; i++) {
      int min = data[i];
      for (int j=i+1; j<data.length; j++) {
        if (min > data[j]) {
        	int temp = min;
          min = data[j];
        	data[j] = temp;
        }
      }
      data[i] = min;
    }
    return data;
  }

}
