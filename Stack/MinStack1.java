package Stack;
import java.util.Stack;
class Pair{
    int x,y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}

public class MinStack1 {
    //BruteForece Approach
    Stack<Pair>stack1;
    int minimum;
    MinStack1()
    {
        stack1=new Stack<>();
    }
    public void push(int value)
    {
        if(stack1.isEmpty())
        {
            minimum=value;
        }
        else if(value<minimum){
            minimum=Math.min(value,minimum);
        }
        else{
            stack1.push(new Pair(value, minimum));
        }
       
    }
    public int getMin()
    {
        return stack1.peek().y;
    }
    public void pop()
    {
        // if (stack1.isEmpty())
        // {
        //     return;
        // }
  
        stack1.pop();
        
    }
    public int top()
    {
       return stack1.peek().x;
    }

    public static void main(String[] args) {
    
        MinStack1 obj=new MinStack1();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());

        
    }
    


    
}
