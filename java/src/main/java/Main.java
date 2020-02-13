import java.util.Arrays;

import arrays.HourGlassSum;

public class Main {
	
	public static void main(String[] args) {

    int[][] data = {
                    {1, 1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0},
                    {0, 0, 2, 4, 4, 0},
                    {0, 0, 0, 2, 0, 0},
                    {0, 0, 1, 2, 4, 0},
                    };
    System.out.println("Array: " + Arrays.toString(data));
    System.out.println("Sorted: " + HourGlassSum.compute(data));
				
	}

}
