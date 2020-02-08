import java.util.Arrays;

import sorts.InsertionSort;

public class Main {
	
	public static void main(String[] args) {

    int[] data = {55, 33, 44, 77, 22, 88, 66, 99, 11, 00};
    System.out.println("Array: " + Arrays.toString(data));
    System.out.println("Sorted: " + Arrays.toString(InsertionSort.sort1(data)));
				
	}

}
