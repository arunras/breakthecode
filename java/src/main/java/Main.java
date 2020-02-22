import java.util.*;

import sorts.*;
import recursion.*;

public class Main {
	
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //int[] primeSet = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    double start = System.currentTimeMillis(); 

    
    //INPUT
    int arr[] = {6, 5, 3, 7, 4, 1, 2, 9, 8, 0}; 

    System.out.println("Arrays: " + Arrays.toString(arr));

    MergeSort.sort(arr, 0, arr.length - 1);

    System.out.println("Sorted: " + Arrays.toString(arr)); 


    double end = System.currentTimeMillis();
    System.out.println("Time: " + ((end - start) / 1000) + "s");
	}

}
