package LL;
import java.util.HashMap;
class Node {
    int data;
    Node next;
    Node (int data)
    {
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    public String toString()
    {
        return String.valueOf(this.data);
    }
}

public class Merg2LL {
    public static void merge2LL(Node h1,Node h2)
    {
        HashMap<Node,Integer>mpp=new HashMap<>();
        while(h1!=null)
        {
          
            mpp.put(h1,1);
            h1=h1.next;
            
        }
        while(h2!=null)
        {
            if(mpp.containsKey(h2))
            {
                System.out.println(h2);
                break;
            }
       
            h2=h2.next;
        }

    }
    
    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(9);
        head1.next.next=new Node(1);
        head1.next.next.next=new Node(2);
        head1.next.next.next.next=new Node(4);

        Node head2=new Node(3);
        head2.next= head1.next.next.next;
        head2.next.next= head1.next.next.next.next;
        merge2LL(head1,head2);
    }
    
}
