package LL;
class Node2{
    int data;
    Node2 next;
    public Node2(int data){
        this.data=data;
    }
    public Node2()
    {
        
    }
    public Node2(int data,Node2 next)
    {
        this.data=data;
        this.next=next;
    }
}
public class Add2LL {
    public static Node2 addTwoLL(Node2 h1,Node2 h2)
    {
        Node2 cur1=h1;
        Node2 cur2=h2;
        Node2 dummyNode=new Node2();
        Node2 currentSum= dummyNode;
        int carry=0;
        while(cur1!=null||cur2!=null||carry==1)
        {
            int sum=0;
            if(cur1!=null)
            {
                sum=sum+cur1.data;
                cur1=cur1.next;
            }
            if(cur2!=null)
            {
               sum=sum+cur2.data;
                cur2=cur2.next;
            }
            Node2 SumNode=new Node2((sum+carry)%10);
            sum=sum+carry;
            carry=sum/10;
            currentSum.next=SumNode;
            currentSum=currentSum.next;
        }
        return dummyNode.next;
    }
    public static void printList(Node2 result)
    {
        while(result!=null)
        {
            System.out.print(result.data+" ");
            result=result.next;
        }

    }
    public static void main(String[] args) {
        Node2 head1=new Node2(2);
        head1.next=new Node2(4);
        head1.next.next=new Node2(6);
        Node2 head2=new Node2(3);
        head2.next=new Node2(8);
        head2.next.next=new Node2(7);
        head2.next.next.next=new Node2(3);
        Node2 ans=addTwoLL(head1,head2);
        printList(ans);
        
    }
}
