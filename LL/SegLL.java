package LL;

public class SegLL {
    public static Node indexWiseSegregation(Node Head)
    {
        Node current=Head;
        Node firstDummyNode=new Node(-1);
        Node secondDummyNode=new Node(-1);
        Node firstNode=firstDummyNode;
        Node secondNode=secondDummyNode;
        int cnt=0;
        while(current!=null)
        {
            if(cnt%2==0)
            {
                firstNode.next=current;
                firstNode=firstNode.next;
            }
            else{
                secondNode.next=current;
                secondNode=secondNode.next;
            }
            cnt++;
            current=current.next;
        }
        secondNode.next=null;
        firstNode.next=secondDummyNode.next;
     
        return firstDummyNode.next;

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
        Node head=new Node(2);
        head.next=new Node(1);
        head.next.next=new Node(3);
        head.next.next.next=new Node(5);
        head.next.next.next.next=new Node(6);
        head.next.next.next.next.next=new Node(4);
        head.next.next.next.next.next.next=new Node(7);
        head= indexWiseSegregation(head);
        printList(head);

    }
    
}
