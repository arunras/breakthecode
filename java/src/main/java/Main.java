import java.util.*;

import sorts.*;
import recursion.*;
import graph.*;
import patterns.slidding_window.*;
import stack.*;

public class Main {
	
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //int[] primeSet = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    double start = System.currentTimeMillis(); 

    
    //INPUT
    int data[] = {6, 5, 3, 7, 4, 1, 2, 9, 8, 0}; 

    //System.out.println("Arrays: " + Arrays.toString(data));

    StackUsingArray stack = new StackUsingArray(10);
		stack.pop();
		System.out.println("=================");
		stack.push(10);
		stack.push(30);
    stack.peek(); 
		stack.push(50);
		stack.push(40);
		System.out.println("=================");
    stack.peek();
		System.out.println("=================");
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("=================");

    double end = System.currentTimeMillis();
    System.out.println("Time: " + ((end - start) / 1000) + "s");
	}

}
