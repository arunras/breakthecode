/*
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8 
 * Explanation: 342 + 465 = 807.
 */

package lc;

public class addTwoNumbers {
  
  class ListNode {
    int val;
    ListNode next;

    ListNode (int x) {
      val = x;
    }
  }

  public static addTwoNumbers.ListNode add2Numbers (addTwoNumbers.ListNode l1, addTwoNumbers.ListNode l2) {
    addTwoNumbers atn = new addTwoNumbers();
    addTwoNumbers.ListNode rHead = atn.new ListNode(0);
    addTwoNumbers.ListNode p = l1, q = l2;
    addTwoNumbers.ListNode current = rHead;
    int carry = 0, sum = 0, reminder = 0;
    int x, y;

    while (p != null || q !=null) {
      x = (p != null) ? p.val : 0;
      y = (q != null) ? q.val : 0;
      sum = carry + (x + y);
      carry = (sum >= 10) ? 1 : 0;
      reminder = sum % 10;
      current.next = atn.new ListNode(reminder);
      current = current.next;

      if (p != null) p = p.next;
      if (q != null) q = q.next;
    }
    if (carry > 0) {
      current.next = atn.new ListNode(carry);
    }
    return rHead.next;
  }

  public static void main(String[] args) {
  	addTwoNumbers atn = new addTwoNumbers();
    addTwoNumbers.ListNode l1 = atn.new ListNode(0);
    addTwoNumbers.ListNode l2 = atn.new ListNode(0);
    addTwoNumbers.ListNode list1 = l1;
    addTwoNumbers.ListNode list2 = l2;

    int[] a1 = new int[] {2, 4, 5};
    int[] a2 = new int[] {5, 6, 4};
   
    for (int i = 0; i < a1.length; i++) {
      l1.next = atn.new ListNode(a1[i]);
      l1 = l1.next;
    }
    list1 = list1.next;

    for (int j = 0; j < a2.length; j++) {
      l2.next = atn.new ListNode(a2[j]);
      l2 = l2.next;
    }
    list2 = list2.next;

    addTwoNumbers.ListNode rHead = add2Numbers(list1, list2);

    System.out.print("l1: [");
    while (list1 != null) {
      System.out.print(list1.val + ", ");  
      list1 = list1.next;
    }
    System.out.println("]");

    System.out.print("l2: [");
    while (list2 != null) {
      System.out.print(list2.val + ", ");  
      list2 = list2.next;
    }
    System.out.println("]");

    System.out.print("Result: [");
    while (rHead != null) {
      System.out.print(rHead.val + ", ");  
      rHead = rHead.next;
    }
    System.out.println("]");
  }
}




