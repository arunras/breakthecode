import leetcode.dp.*;

public class Main {
	
	public static void main(String[] args) {
    double start = System.currentTimeMillis(); 
//====TEST===============================================
    
    int[] prices = {7, 1, 5, 3, 6, 4};

    System.out.print("Output: " + BuySellStock2.maxProfit(prices));
    
    
//====TEST==============================================
    double end = System.currentTimeMillis();
    System.out.println("\nTime: " + ((end - start) / 1000) + "s");
	}

}
