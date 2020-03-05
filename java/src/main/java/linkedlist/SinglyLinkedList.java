package linkedlist;

public class SinglyLinkedList {
  private Node head;

  public boolean isEmpty() {
    return (head == null);
  }

  public void insertFirst(Node node) {
    node.next = head;
    head = node;  
  }

  public void insertLast(Node node) {
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = node;
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


  public void printLinkedList() {
    System.out.println("LinkedList: ");
    Node current = head;
    while (current != null) {
      System.out.print("->" + current.data);
      current = current.next;
    }
    System.out.println();
  }
}
