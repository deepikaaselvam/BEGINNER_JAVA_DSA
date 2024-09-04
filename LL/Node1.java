package LL;

public class Node1 {
    int data;
    Node1 next;
    public Node1(int data)
    {
        this.data=data;
        this.next=null;
    }

    public Node1(int dataa,Node1 nextt)
    {
        this .data=dataa;
        this.next=nextt;

    }
    public String toString()
    {
        return Integer.toString(data);
    }

    
}
