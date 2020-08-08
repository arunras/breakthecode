import leetcode.CoinChange;

public class Main {
	
	public static void main(String[] args) {
    double start = System.currentTimeMillis(); 
//====TEST===============================================
    
    int[] coins = {1,2,5};
    int amount = 11;

    System.out.print("Output: " + CoinChange.change(coins, amount));
    
    
//====TEST==============================================
    double end = System.currentTimeMillis();
    System.out.println("\nTime: " + ((end - start) / 1000) + "s");
	}

}
