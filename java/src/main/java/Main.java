import java.util.*;

import sorts.*;
import recursion.*;

public class Main {
	
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //int[] primeSet = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    //System.out.println("PrimeSet: " + Arrays.toString(primeSet));
    double start = System.currentTimeMillis(); 

    
    //INPUT
    String str = "123455432";

    System.out.println("Is" + str + " palindrome? : " + Palindrome.isPalindrome(str));
    
    
    double end = System.currentTimeMillis();
    System.out.println("Time: " + ((end - start) / 1000) + "s");
	}

}
