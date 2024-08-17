package LL;
public class DelPos {
    private static Node1  array_2_LL(int[]arr){
        Node1 head=new Node1(arr[0]);
        Node1 mover=head;
        for(int i=1;i<arr.length;i++)
        {
            Node1 temp=new Node1(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;
    }
    private static void display(Node1 head)
    {
        Node1 cur1=head;
        System.out.println("The Original LL will be");
        while(cur1!=null)
        {
            System.out.print(cur1.data+" -> ");
            cur1=cur1.next;
        }
        System.out.println("null");
    }
    public static Node1 PrintElement(Node1 head)
    {
        Node1 currentElement=head;
        System.out.println();
        while(currentElement!=null)
        {
            
            System.out.print(currentElement.data+"  -> ");
            currentElement=currentElement.next;
        }
       
        return currentElement;
    }
   private static Node1 deleteByPosition(Node1 head,int k)
    {
        if(head==null)
        {
            return null;
        }
        if(k==1)
        {
            Node1 temp=head;
            head=head.next;
        }
        int cnt=0;
        Node1 prev=null;
        Node1 current=head;
        while(current!=null)
        {
            cnt++;
            if(cnt==k)
            {
                prev.next=prev.next.next;
                break;
               
            }
            prev=current;
            current=current.next;
        }
        return head;
    }
public static void main(String[] args) {
        int arrayvalue[]={12,5,6,7,8};
        Node1 head=array_2_LL(arrayvalue);
        display(head);
        int k=3;
        head=deleteByPosition(head,k);
        Node1 temp=PrintElement(head);
        System.out.println(temp);
    }
    
}
