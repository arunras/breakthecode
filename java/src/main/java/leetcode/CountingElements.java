package leetcode;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class CountingElements {
  
  public int count(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for (int v : arr) {
      set.add(v);  
    }
    int count = 0;
    for (int i : arr) {
      if (set.contains(i+1)) {
        count++;
      }
    }
    return count;
  }

}
