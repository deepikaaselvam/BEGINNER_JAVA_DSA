package Stack;
import java.util.Stack;
public class PostToPrefix {
    public static String postToPrefixExpression(String s)
    {
        Stack<String>st=new Stack<>();
        String ans="";
        int i=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                ans=ans+s.charAt(i);
                st.push(Character.toString(ch));
            }
            else{
                String s1=st.peek();
                st.pop();
                String s2=st.peek();
                st.pop();
                ans=s.charAt(i)+s2+s1;
                st.push(ans);
            }
            i++;
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String string="AB-DE+F*/";
        System.out.println(postToPrefixExpression(string));
    }
    
}
