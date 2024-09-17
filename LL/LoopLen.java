package LL;

public class LoopLen {
    public static void lengthOfTheLoop(Node head)
    {
        
    }
    public static void main(String[] args) {
        Node head=new Node(25);
        head.next=new Node(14);
        head.next.next=new Node(19);
        // head.next.next.next=new Node(33);
        // head.next.next.next.next=new Node(10);
        // head.next.next.next.next.next=new Node(21);
        // head.next.next.next.next.next.next=new Node(39);
        // head.next.next.next.next.next.next.next=new Node(45);
        // head.next.next.next.next.next.next.next.next=new Node(58);
        // head.next.next.next.next.next.next.next.next.next=new Node(90);
        // head.next.next.next.next.next.next.next.next.next.next=head.next.next.next;
        lengthOfTheLoop(head);

    }
    
}
