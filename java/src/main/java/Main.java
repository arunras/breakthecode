import java.util.Arrays;

import sorts.SelectionSort;

public class Main {
	
	public static void main(String[] args) {

    int[] data = {55, 99, 33, 11, 22, 88, 44, 77, 66, 00};
    System.out.println("Array: " + Arrays.toString(data));
    System.out.println("Sorted: " + Arrays.toString(SelectionSort.selectionSort(data)));
				
	}

}
