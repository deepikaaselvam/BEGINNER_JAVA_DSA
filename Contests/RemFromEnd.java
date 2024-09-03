package Contests;

public class RemFromEnd {
    public static Node removeFromEndLL(Node head,int n)
    {
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
       
        if(fast==null)
        {
            return head.next;
        }
       
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        Node delete=slow.next;
        slow.next=slow.next.next;
        // delete=null;

        return head;

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
        // head.next.next.next.next=new Node(5);
        int N=4;
        printList(head);
        System.out.println();
        head=removeFromEndLL(head,N);
        printList(head);
    }
    
}
