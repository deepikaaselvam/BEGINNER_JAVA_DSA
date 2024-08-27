package LL;
import java.util.HashSet;
public class RemDup {
    public static HashSet<Object> removeDuplicatesInLL(Node head)
    {
        Node current=head;
        HashSet<Object>set=new HashSet<>();
        while(current!=null)
        {
            set.add(current.data);
            current=current.next;
        }
        return set;


    }
    public static void main(String[] args) {
        //Duplicate Node will be created!!!
        Node head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(5);
        System.out.println(removeDuplicatesInLL(head));

    }
    
}
