package Contests;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data; 
    }
    Node (int data1,Node next)
    {
        this.data=data1;
        this.next=next;
    }
}

public class delLL {
    public static void printList(Node head)

    {
        Node current1=head;
        while(current1!=null)
        {
            System.out.print(current1.data+" ");
            current1=current1.next;
        }
    }
    public static Node delTheParticularElement(Node head,int data1)
    {
        Node current=head;
        Node prev=null;
        while(current!=null)
        {
            if(current.data == data1)
            {
                prev.next=prev.next.next;
            }
            prev=current;
            current=current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(6);
        head.next.next.next.next=new Node(4);
        head.next.next.next.next.next=new Node(5);
        head.next.next.next.next.next.next=new Node(6);
        int val=6;
        delTheParticularElement(head,val);
        printList(head);
        
    }
    
}
