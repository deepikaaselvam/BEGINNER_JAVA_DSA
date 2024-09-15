package LL;
public class RemDupII {
    public static Node removeDuplicatesFromLL(Node head)
    {
       Node curr=head;
        Node dummyNode=new Node(-1);
        Node prev=dummyNode;
        dummyNode.next=head;
        while(curr!=null)
        {
            if(curr.next!=null&& curr.data==curr.next.data)
            {
                while(curr.next!=null && curr.data==curr.next.data)
                {
                   curr=curr.next;
                }
                prev.next=curr.next;
            }
            else{
                prev=prev.next;
            }
            curr=curr.next;
        }
       return dummyNode.next;
    }
    public static void main(String[] args) {
        Node head =new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(1);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(5);
      
        Node ans=removeDuplicatesFromLL(head);
        while(ans!=null)
        {
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}
