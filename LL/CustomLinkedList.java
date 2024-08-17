package LL;


public class CustomLinkedList {
    Node head;  // Head is the first node in the linked list

    // Method to add a new node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);  // Create a new node
        if (head == null) {
            head = newNode;  // If the list is empty, the new node becomes the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;  // Traverse to the end of the list
            }
            current.next = newNode;  // Link the last node to the new node
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;  // Move to the next node
        }
        System.out.println("null");  // End of list
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();  // Output: 10 -> 20 -> 30 -> null
    }
}


    

