import leetcode.tree.*;

public class Main {
	
	public static void main(String[] args) {
    double start = System.currentTimeMillis(); 
//====TEST===============================================
    
    int[] preorder = {8,5,1,7,10,12};

    System.out.print("Output: [");
    System.out.print(BSTPreorder.bstFromPreorder(preorder).toString());
    System.out.print("]");
    
    
//====TEST==============================================
    double end = System.currentTimeMillis();
    System.out.println("\nTime: " + ((end - start) / 1000) + "s");
	}

}
