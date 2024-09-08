package Stack;
import java.util.Stack;
import java.lang.StringBuilder;

public class InfixToPrefix {
    public static int priority(int op)
    {
        switch(op)
        {
            case '+','-':
            return 1;
            case '*','/':
            return 2;
            case '^':
            return 3;
           
        }
        return 0;
    }
    public static void main(String[] args) {
        String s="(A+B)*C-D+E";
        StringBuilder sb=new StringBuilder(s);
        StringBuilder stringg=sb.reverse();
        String answer="";
        int i=0;
        int n=stringg.length();
        Stack<Character>stk=new Stack<>();
        while(i<n)
        {
            if((i>='A'&&i<='Z') ||
            (i>='a'&&i<='z')||
            (i>='0'&&i<='9'))
            {
                answer=answer+stringg.charAt(i);
            }
            else if(stringg.charAt(i)=='(')
            {
                stk.push(stringg.charAt(i));
            }
            else if(stringg.charAt(i)==')')
            {
                while(!stk.empty() && stk.peek()!='(')
                {
                    answer=answer+stk.peek();
                    stk.pop();
                }
                stk.pop();
            }
            else if(stringg.charAt(i)=='^')
            {
                while(!stk.empty()&& priority(stringg.charAt(i))<priority(stk.peek()))
                {
                    answer=answer+stk.peek();
                    stk.pop();
                }
            }
            else{
                while(!stk.empty()&& priority(stringg.charAt(i))<priority(stk.peek()))
                {
                    answer=answer+stk.peek();
                    stk.pop();
                }
            }
            i++;x
        }
        System.out.println(answer);
    }
}
