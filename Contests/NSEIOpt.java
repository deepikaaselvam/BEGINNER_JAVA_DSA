package Contests;
import java.util.Stack;
public class NSEIOpt {
    public static int[]findNxtSmallerElement(int[]a)
    {
        Stack<Integer>st=new Stack<>();//Try to store it in the modified array!! it will guive the correct result
        int result[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            while(!st.isEmpty()&& st.peek()>=a[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                result[i]=-1;
            }
            else{
                result[i]=st.peek();
            }
            st.push(a[i]);
        }
      
        
        return result;
    }
    public static void main(String[] args) {
        int[]array={5,7,9,6,7,4,5,1,3,7};
        int ans[]=findNxtSmallerElement(array);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    
}
