package Stack;

import java.util.Stack;
class QUseStack  {
    Stack<Integer>st1;
    Stack<Integer>st2;
    public QUseStack () {
      st1=new Stack<>();
      st2=new Stack<>();
    }
    public void push(int x) {
        System.out.println(st1.push(x));
        
    }
    public int pop() {
        if(st2.isEmpty())
        {
            while(!st1.isEmpty())
            {
                st2.push(st1.peek());
                st1.pop();
            }
        }
        return st2.pop();
    }
    public int peek() {
         if(st2.isEmpty())
        {
            while(!st1.isEmpty())
            {
                st2.push(st1.peek());
                st1.pop();
            }
        }
         return st2.peek();
    }
    public boolean empty() {
        
        return  st1.isEmpty()&& st2.isEmpty();
    }
    public static void main(String[] args) {
        QUseStack obj=new QUseStack();
        obj.push(1);
        int pram1=obj.pop();
        boolean pram2=obj.empty();
        System.out.println(pram1+" "+pram2);
    }
}


