package LL;
public class Node{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
   
    Node()
    {

    }
    public String toString(int data)
    {
        return Integer.toString(data);
    }
}


    

