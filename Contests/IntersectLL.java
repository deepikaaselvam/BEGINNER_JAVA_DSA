package Contests;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}
public class IntersectLL {
    public static Node  intersectionAtTheTwoLinkedList(Node headA,Node headB)
    {
        Node skipA=headA.next.next;
        Node skipB=headB.next.next.next;
        // if(headA[skipA]==headB[skipB])
        {
            System.out.print(String.valueOf(skipA.next));
        }
        return new Node(0);
    }
    public static void main(String[] args) {
        Node head1=new Node(4);
        head1.next=new Node(1);
        head1.next.next=new Node(8);
        head1.next.next.next=new Node(4);
        head1.next.next.next.next=new Node(5);

        Node head2=new Node(5);
        head2.next=new Node(6);
        head2.next.next=new Node(1);
        head2.next.next.next=new Node(8);
        head2.next.next.next.next=new Node(4);
        head2.next.next.next.next.next=new Node(5);

        intersectionAtTheTwoLinkedList(head1,head2);
        
    }
    
}
