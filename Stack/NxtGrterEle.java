package Stack;
import java.util.Stack;
public class NxtGrterEle {
   
    public static int[] nextGreaterElement(int[]a1)
    {
        Stack<Integer>element=new Stack<>();
        int NGE[]=new int[a1.length];
        for(int i=a1.length-1;i>=0;i--)
        {
           while(!element.isEmpty()&& a1[i]>element.peek())
            {
               element.pop();
              
            }
            if(element.isEmpty())
            {
                NGE[i]=-1;
            }
            else
            {
                NGE[i]=element.peek();
            }
            
            element.push(a1[i]);
        }
        return NGE;
        
    }
    public static void main(String[] args) {
        int[]array={4,12,5,3,1,2,5,3,1,2,4,6};
       int []answer= nextGreaterElement(array);
       for(int i=0;i<answer.length;i++)
       {
            System.out.print(answer[i]+" ");
       }

    }
    
}
