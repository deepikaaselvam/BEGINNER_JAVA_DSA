package Stack;
import java.util.Stack;
public class PreToPost {
    public static String prefixToPostFixExpression(String qn)
    {
        Stack<String>st=new Stack<>();
        String ans="";
        int i=qn.length()-1;
        while(i>=0)
        {
            char ch=qn.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                ans=ans+qn.charAt(i);
                st.push(Character.toString(ch));
            }
            else{
                String s1=st.peek();
                st.pop();
                String s2=st.peek();
                st.pop();
                ans=s1+s2+qn.charAt(i);
                st.push(ans);
            }

            i--;
        }
        return st.pop();

    }
    public static void main(String[] args) {
        String s="/-AB*+DEF";
        System.out.println(prefixToPostFixExpression(s));

    }
    
}
