import java.util.Arrays;

import sorts.SelectionSort;

public class Main {
	
	public static void main(String[] args) {

    int[] data = {15, 19, 13, 11, 12, 18, 14, 17, 16, 10};
    System.out.println("Array: " + Arrays.toString(data));
    System.out.println("Sorted: " + Arrays.toString(SelectionSort.selectionSort(data)));
				
	}

}
