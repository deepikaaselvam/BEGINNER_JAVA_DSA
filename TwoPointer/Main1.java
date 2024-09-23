package TwoPointer;
import java.util.Stack;
public class Main1 {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        int[]array={10,45,20,40,60,50,100};
      int newArray[]=new int[array.length];
        for(int i=array.length-1;i>=0;i--)
        {
            while(!st.isEmpty()&&array[i]>=st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                st.push(array[i]);
                newArray[i]=st.peek();
            }
            else{
                newArray[i]=st.peek();
            }
                    st.push(array[i]);
                
            }
          
           
        
     
        for(int i=0;i<newArray.length;i++)
        {
            System.out.print(newArray[i]+" ");
        }
    }
        
        
}
    

