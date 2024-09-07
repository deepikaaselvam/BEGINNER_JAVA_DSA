package LL;
import java.util.Stack;
public class RevLLII {
    public static Node reverseLinkedListII(Node head,Node l,Node r)
    {
        Node curr=l;
        Stack<Integer>stck=new Stack<>();
        while(l <= r){

            
       




     

    }
       return curr;
}
    public static void printList(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        Node left=head.next;
        Node right=head.next.next.next.next;
        head=reverseLinkedListII(head,left,right);
        printList(head);
    }
    
}

