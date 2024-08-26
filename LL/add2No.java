package LL;
class Node3{
    int data;
    Node3 next;
    Node3(int data,Node3 next)
    {
        this.data=data;
        this.next=next;

    }
    Node3(int data)
    {
        this.data=data;
    }
    Node3()
    {

    }
}

public class add2No {

    public static void printList(Node result)
    {
        while(result!=null)
        {
            System.out.print(result.data+" ");
            result=result.next;
        }
    }

    
    public  static Node3 AddTwoNumbers(Node3 FirstNode,Node3 SecondNode)
    {
        Node3 Temp1=FirstNode;
        Node3  Temp2=SecondNode;
        Node3 dummyNode=new Node3();
        Node3 AnswerNode=dummyNode;int carry=0;
        while(Temp1!=null||Temp2!=null||carry==1)
        {
            int sum=0;
            if(Temp1!=null)
            {
                sum=Temp1.data+sum;
                Temp1=Temp1.next;
            }
            if(Temp2!=null)
            {
                sum=sum+Temp2.data;
                Temp2=Temp2.next;
            }
            Node3 sumNode=new Node3((sum+carry)%10);
            carry=(sum+carry)/10;
            AnswerNode.next=sumNode;
            AnswerNode=AnswerNode.next;
        }
        return dummyNode.next;

    }
    public static void printList(Node3 result)
    {
        while(result!=null)
        {
            System.out.print(result.data+" ");
            result=result.next;
        }
    }
    public static void main(String[] args) {
        Node3 head3=new Node3(2);
        head3.next=new Node3(9);
        head3.next.next=new Node3(3);

        Node3 head4=new Node3(4);
        head4.next=new Node3(7);
        head4.next.next=new Node3(1);

        Node3 ans=AddTwoNumbers(head3,head4);
        printList(ans);


    }
    
}
