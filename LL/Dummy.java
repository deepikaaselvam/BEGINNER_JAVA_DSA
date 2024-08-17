package LL;

public class Dummy {
    private static void passValue(Node1 current)
    {

    }
    public static void main(String[] args) {
        Node1 head=new Node1(12);
        head.next=new Node1(16);
        head.next.next=new Node1(90);
        head.next.next.next=new Node1(100);
        Node1 temp=head;
        passValue(temp);
    }
    
}
