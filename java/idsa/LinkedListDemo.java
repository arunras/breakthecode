package idsa;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.insertAtHead(1);
    list.insertAtHead(2);
    list.insertAtHead(3);
    list.insertAtHead(4);
    list.insertAtHead(5);
    list.insertAtHead(6);

    list.deleteFromHead();

    System.out.println(list);
    System.out.println("Length: " + list.length());

    System.out.print("Found: " + list.find(3));
  }
}
