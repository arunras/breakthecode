import leetcode.TwoSum;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {

    int[] nums = {2, 7, 11, 15};
    int target = Integer.parseInt(args[0]);
    System.out.println("Array: " + Arrays.toString(nums));
	  System.out.println("Result: " + Arrays.toString(TwoSum.twoSum2(nums, target)));
				
	}

}
