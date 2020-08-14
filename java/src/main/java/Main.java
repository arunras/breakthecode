import leetcode.amazon.*;

public class Main {
	
	public static void main(String[] args) {
    double start = System.currentTimeMillis(); 
//====TEST===============================================
    
    String s = "abcabc"; 
    int k = 3; 

    System.out.println("Input: " + s);
    System.out.print("Output: " + SubstringOfSizeK.find(s, k).toString());
    
    
//====TEST==============================================
    double end = System.currentTimeMillis();
    System.out.println("\nTime: " + ((end - start) / 1000) + "s");
	}

}
