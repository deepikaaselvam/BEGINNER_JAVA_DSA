package Contests;

public class DelNode {
    public static Node deleteNode(Node head,int ele)
    {
        Node curr=head;
        Node previous=null;
        while(curr!=null)
        {
            if(curr.data==ele)
            {
                previous.next=previous.next.next;
                
            }
            previous=curr;
            curr=curr.next;
        }
        return head;

    }
    public static void printList(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"   ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(2);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(1);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(1);
        int element=1;
        head=deleteNode(head,element);
        printList(head);
    }
    
}
