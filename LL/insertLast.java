package LL;

public class insertLast {
    public static void insertatLast(Node1 head)
    {
        Node1 temp=head;
        Node1 newNode=new Node1(900);
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
        System.out.println();
    }
    public static void main(String[] args) {
        Node1 head=new Node1(12);
        head.next=new Node1(13);
        head.next.next=new Node1(14);
        head.next.next.next=new Node1(17);
        insertatLast(head);


    }
    
}
