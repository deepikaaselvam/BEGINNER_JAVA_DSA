package Contests;
import java.lang.StringBuilder;
public class LLtoList {
    public static int  binaryNumberLLtoList(Node head1)
    {
        StringBuilder sb=new StringBuilder();
        Node current=head1;
        while(current!=null)
        {
            sb.append(current.data);
            current=current.next;
        }
      
        int answer=0;int pwer=0;
        for(int i=sb.length()-1;i>=0;i--)
        {
            answer+=Math.pow(2,pwer)*(sb.charAt(i)-'0');
            pwer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(0);
        head.next.next=new Node(1);
        System.out.println(binaryNumberLLtoList(head));
    }
    
}
