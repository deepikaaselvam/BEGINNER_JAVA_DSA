package LL;

public class InsertEnd {
    public static  void printList(Node answer)
    {
        Node result=answer;
        while(result!=null)
        {
            System.out.print(result.data+" ");
            result=result.next;
        }
    }
    public static Node insertattheEnd(Node head1,int x)
    {
        Node curr=head1;
        while(curr.next!=null)
        {
            System.out.print(curr.data+"    ");
            curr=curr.next;
        }
        curr.next=new Node(x);
        return curr;

    }
    public static void main(String[] args) {
        Node head=new Node(1);
 
        int x=6;
        Node ans=insertattheEnd(head,x);
        printList(ans);
    }
    
}
