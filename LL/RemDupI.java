package LL;
// import java.util.HashSet;

public class RemDupI {
    public static Node removeDuplicatesInLL(Node head)
    {
        if(head==null)
        {
            return null;
        }
       Node current=head;
        while(current.next!=null)
        {
            if(current.data == current.next.data)
            {
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return head;


    }

    public static void printList(Node head)
    {
        Node curr=head;
       
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        //Duplicate Node will be created!!!
        Node head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(3);
        head.next.next.next.next.next=new Node(5);
        head=removeDuplicatesInLL(head);
        printList(head);
        // HashSet<Integer>st=new HashSet<>();
        // Node curr=head;
        // while(curr!=null)
        // {
        //     st.add(curr.data);
        //     curr=curr.next;
        // }
        // System.out.println(st);
        

    }
    
}
