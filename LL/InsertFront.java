package LL;
//if class nodes is in the same package of LL,So we do not need to add the Class nodes on every files!!
public class InsertFront {
    public static Node insertFront(Node head){
    Node new_data=new Node(0);
        new_data.next=head;
        head=new_data;
    return head;
}
    public static void PrintListNodes(Node head)
    {
        
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        insertFront(head);
        PrintListNodes(head);
    }
    
}
