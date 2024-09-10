package Stack;
import java.util.Stack;
public class MinStack2 {
    Stack<Integer>st=new Stack<>();
    int mini;
    public MinStack2()
    {
        mini=Integer.MAX_VALUE;
    }
    public  void push(int val)
    {
    
        int value=Integer.valueOf(val);
        
        if(st.isEmpty())
        {
            mini=value;
            st.push(value);
        }
        else if(value<mini)
        {
            mini=value;
            st.push(value);
        }
        else{
            st.push(value);
        }
    }
    public int getMin()
    {
        return mini;
    }
    public void pop()
    {
        if(st.isEmpty())
        {
            return ;
        }
        int value=st.pop();
        if(value<mini)
        {
            mini=(2*mini)-value;
        }
    }
    public int top()
    {
        int val=st.peek();
        if(val<mini)
        {
            return mini;
        }
        return val;
        
    }

    public static void main(String[] args) {
        MinStack2 obj=new MinStack2();
       
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    
        
    }
   

    
}
