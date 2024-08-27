package LL;
class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data=data;
    }
    public Node1()
    {

    }
}

public class insertLast {
    public static void printList(Node1 result)
    {
        Node1 Lastone=result;
        while(Lastone!=null)
        {
            System.out.print(Lastone.data+" ");
            Lastone=Lastone.next;
        }
    }
    public static Node1 insertatLast(Node1 head,int x)
    {
        Node1 temp=head;
        Node1 newNode=new Node1(1000);
        if(temp==null)
        {
            return newNode;
        }
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        temp.next=newNode;
     
       
        return temp;
    }
    public static void main(String[] args) {
        Node1 head=new Node1();
       
        int x=10;
        Node1 answer=insertatLast(head,x);
        printList(answer);


    }
    
}
