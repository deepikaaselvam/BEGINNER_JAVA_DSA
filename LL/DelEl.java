package LL;

public class DelEl {
    public static Node1 delElementValue(Node1 head,int elements)//But it does not work for del the first Node 
    {
        
        if(head==null||head.next==null)
        {
            return head;
        }
        if(head.data==elements)
        {
            return head.next;
        }
        Node1 current=head;
        Node1 prev=null;
        while(current!=null){
            if(current.data==elements)
            {
                prev.next=prev.next.next;
                
                
            }
            prev=current;
            current=current.next;
            
        }
        return current;
    }
    public static void main(String[] args) {
        Node1 head=new Node1(12);
        head.next=new Node1(15);
        head.next.next=new Node1(13);
        head.next.next.next=new Node1(14);
        int element1=13;
        Node1 temp=head;
        delElementValue(temp,element1);
        while(temp!=null)
        {
            System.out.print(temp.data+" ");;
            temp=temp.next;
        }

    }
    
}
