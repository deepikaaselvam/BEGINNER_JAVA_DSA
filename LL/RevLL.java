package LL;
public class RevLL {
    public static void reverseALinkedList(Node head)
    {
        Node curr=head,prev=null;
        while(curr!=null)
        {
            Node front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
         curr=prev;
        while(curr!=null)
        {
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Node head=new Node(12);
        head.next=new Node(5);
        head.next.next=new Node(8);
        head.next.next.next=new Node(7);
        reverseALinkedList(head);
    }
}
