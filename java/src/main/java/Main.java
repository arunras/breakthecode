import leetcode.dp.*;

public class Main {
	
	public static void main(String[] args) {
    double start = System.currentTimeMillis(); 
//====TEST===============================================
    
    int[] prices = {7,6,4,3,1};

    System.out.print("Output: " + BuySellStock1.maxProfit(prices));
    
    
//====TEST==============================================
    double end = System.currentTimeMillis();
    System.out.println("\nTime: " + ((end - start) / 1000) + "s");
	}

}
