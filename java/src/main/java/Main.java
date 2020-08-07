import java.util.Scanner;

import leetcode.CellCompete;
import leetcode.PrisonCells;

public class Main {
	
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //int[] primeSet = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    double start = System.currentTimeMillis(); 
    
    //==INPUT
    //int data[] = {1,1,2,2}; //{6, 5, 3, 7, 4, 1, 2, 9, 8}; 
    int[][] data = {{1,3,1},{1,5,1},{4,2,1}};
    //System.out.println("Arrays: " + Arrays.toString(data));
//====TEST===============================================
    
    int[] A = {1,0,0,0,0,1,0,0};
    int days = 1;
    int[] Ar = {0,0,0,0,0,1,1,0};
    
    int[] B = {1,1,1,0,1,1,1,1};
    days = 2;
    int[] Br = {0,1,0,0,1,0,1,0};

    
    System.out.print("Output: { ");
    for (int c : CellCompete.cellCompete(B, days)) {
    	System.out.print(c + " ");
    }
    System.out.print("}");
    
    
//====TEST==============================================

    double end = System.currentTimeMillis();
    System.out.println("\nTime: " + ((end - start) / 1000) + "s");
	}

}
