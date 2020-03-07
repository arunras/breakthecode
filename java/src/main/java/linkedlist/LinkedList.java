package linkedlist;

public class LinkedList {
  private Node head;

  public boolean isEmpty() {
    return (head == null);
  }

  public void insertFirst(Node node) {
    node.next = head;
    head = node;  
  }

  public void insertLast(Node node) {
    if (head == null) {
      head = node;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = node;
    }
  }

  public Node deleteFirst() {
    Node temp = head;
    head = head.next;
    return temp;
  }

  public void deleteLast() {
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current = null;
  }

  public void deleteAfter(Node node) {
    Node current = head;
    while (current.next != null && current.data != node.data) {
      current = current.next;
    }
    if (current.next != null) {
      current.next = current.next.next;
    }
  }

  public void printLinkedList(Node head, String title) {
    System.out.println(title);
    Node current = head;
    while (current != null) {
      System.out.print("->" + current.data);
      current = current.next;
    }
    System.out.println("\n");
  }

//===Algorithms==========================================================
  // Link: https://leetcode.com/problems/reverse-linked-list/
  public Node reverseLinkedList(Node head) {
    Node prev = null;
    Node current = head;
    Node next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  // Link: https://leetcode.com/problems/middle-of-the-linked-list/
  public Node findMiddleNode(Node head) {
    Node slow, fast;
    slow = fast = head;
    while (fast != null) {
      fast = fast.next;
      if (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next;
      }
    }
    return slow;
  }
//===Algorithms==========================================================
}





















