package LL;

public class SLLTraverse {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=next;
        }
    }

  
    public static void printList(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(" "+current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
     
        Node Third=new Node(5);
        Node second=new Node(4,Third);
        Node head=new Node(2,second);
       printList(head);
    
        
    }
    
}
