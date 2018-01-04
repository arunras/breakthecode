/*
 * Given nums = [2, 7, 11, 15], target = 9, 
 * Because nums[0] + nums[1] = 2 + 7 = 9, 
 * return [0, 1].
 */

package lc;

import java.util.Map;
import java.util.HashMap;

public class twoSumArray {
  public int[] twoSum (int[] nums, int target) {
    Map <Integer, Integer> map = new HashMap <> ();
    int complement;
    for (int i = 0; i < nums.length; i++) {
      complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] {map.get(complement), i};
      } 
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException ("No two sum solution");
  }
}
