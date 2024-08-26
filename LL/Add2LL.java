package LL;

public class Add2LL {
    public static Node addTwoLL(Node h1,Node h2)
    {
        Node cur1=h1;
        Node cur2=h2;
        while(cur1!=null||cur2!=null)
        {
            int carry=0;
        Node current=new Node((h1.data+h2.data+carry)%10);
        
     
        return current;
        }
        return cur1;

    }
    public static void printList()
    {

    }
   
    
    public static void main(String[] args) {
        Node head1=new Node(2);
        head1.next=new Node(4);
        head1.next.next=new Node(6);
        Node head2=new Node(3);
        head2.next=new Node(8);
        head2.next.next=new Node(7);
        head2.next.next.next=new Node(3);
        System.out.println(addTwoLL(head1,head2));
        // printList(head1,head2);


    }
    
}
