
package LL;
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class SLL{
    public static void printList(Node head) {
        Node current=head;
        while (current != null) {
           
            System.out.print(" " + current.data);
            current=current.next;
        }
        System.out.println();
    }
     public static void main(String[] args) {
        // 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        System.out.print("Linked List:");
        printList(head);
    }
}
