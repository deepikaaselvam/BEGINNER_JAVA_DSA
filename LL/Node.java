package LL;
public class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    Node()
    {

    }
    public String toString(int data)
    {
        return Integer.toString(data);
    }
}


    

