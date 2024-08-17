package LL;
class  Nodee{
    int data;
    Nodee next;
    Nodee(int data)
    {
        this.data=data;
        this.next=null;
    }
    Nodee(int data,Nodee next)
    {
        this.data=data;
        this.next=next;
    }
}
public class SearchLL {

    public static boolean SearchElementLL(Nodee head,int target)
    {
        Nodee current=head;
        while(current!=null)
        {
            if(current.data==target)
            {
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Nodee head=new Nodee(2);
        head.next=new Nodee(3);
        head.next.next=new Nodee(5);
        head.next.next.next=new Nodee(9);
        int target=9;
        System.out.println(SearchElementLL(head,target));
        
    }
    
}
