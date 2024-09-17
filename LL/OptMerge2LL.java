package LL;

public class OptMerge2LL {
    public static void merge2LL(Node h1,Node h2)
    {
        Node cur1=h1;
        Node cur2=h2;
        int cnt1=0,cnt2=0;
        while(cur1!=null || cur2!=null){
            if(cur1!=null)
            {
                cnt1++;
                cur1=cur1.next;
            }
           if(cur2!=null)
           {
            cnt2++;
            cur2=cur2.next;
            
           }
        }
        System.out.println(cnt1+" "+cnt2);
    }
    public static void main(String[] args) {
        Node head1=new Node(1);
        head1.next=new Node(9);
        head1.next.next=new Node(1);
        head1.next.next.next=new Node(2);
        head1.next.next.next.next=new Node(4);

        Node head2=new Node(3);
        head2.next= new Node(2);
        head2.next.next= new Node(4);
        merge2LL(head1,head2);
    }
    
}
