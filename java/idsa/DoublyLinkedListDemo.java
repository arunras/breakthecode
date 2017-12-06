package idsa;

public class DoublyLinkedListDemo {
  public static void main(String[] args) {
    DoublyLinkedList integers = new DoublyLinkedList();

    integers.insertAtHead(1);
    integers.insertAtHead(2);
    integers.insertAtHead(3);
    integers.insertAtHead(4);
    integers.insertAtHead(5);

    System.out.println(integers);
  }
}
