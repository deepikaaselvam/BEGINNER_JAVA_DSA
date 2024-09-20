package Stack;
import java.util.Stack;

public class VParantheses {//It takes the runtime of 4ms.To Optimise ,I will done the code on "OuterParanthesis2"
    public static void main(String[] args) {
        Stack<Character>st=new Stack<>();
        String answer="";
        String s="(()())(()(())";
    for(int i=0;i<s.length();i++)
    {
        if(st.isEmpty())
        {
            st.push(s.charAt(i));
        }
        else if(s.charAt(i)==')'&&st.peek()=='('&&!st.isEmpty())
        {
            st.pop();
            if(st.isEmpty())
            {
                continue;
            }
            else{
                answer+=s.charAt(i);
            }
        }
        
        else if(s.charAt(i)=='(')
        {
            st.push(s.charAt(i));
            answer+=s.charAt(i);
        }
        
    }
    System.out.println(answer);
        
       
     
       
       
    }
    
}
