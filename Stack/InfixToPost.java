package Stack;
import java.util.Stack;
public class InfixToPost {
    public static int priority(char operator)
    {
        switch(operator)
        {
            case '+':
            case '-':
            return 1;
            case '*':
            case '/':
            return 2;
            case '^':
            return 3;
            default :
            break;
        }
        return -1;
    }
    public static void infixToPostixOperation(String qn)
    {
        Stack<Character>stk=new Stack<>();
        int i=0;
        String answer="";
        while(i<qn.length())
        {
            if((qn.charAt(i)>='A'&&qn.charAt(i)<='Z')||
            (qn.charAt(i)>='a' && qn.charAt(i)<='z')||
            (qn.charAt(i)>=0&& qn.charAt(i)<=9))
            {
                answer=answer+qn.charAt(i);
            }
            else if(qn.charAt(i)=='(')
            {
                stk.push(qn.charAt(i));
            }
            else if(qn.charAt(i)==')')
            {
                while(!stk.empty() && stk.peek()!='(')
                {
                    answer=answer+stk.peek();
                    stk.pop();
                }
                stk.pop();
             }
             else{
                while(!stk.empty() && priority(qn.charAt(i))<=priority(stk.peek()))
                {
                    answer=answer+stk.pop();
                    
                }
                stk.push(qn.charAt(i));
             }
            i++;
        }
            while(!stk.empty())
            {
                answer=answer+stk.peek();
                stk.pop();
            }
        
        System.out.print(answer+" ");
    }

    public static void main(String[] args) {
        String question="a+b*(c^d-e)";
        infixToPostixOperation(question);

    }
    
}
