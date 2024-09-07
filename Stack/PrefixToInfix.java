package Stack;
import java.util.Stack;
import java.lang.String;
// import java.lang.Character;
public class PrefixToInfix {
    public static String prefixToInfixOrder(String s){
        Stack<String>st=new Stack<>();
        int  n=s.length()-1;
        String answer="";
        int i=n;
        while(i>=0)
        {
            char c=s.charAt(i);
            if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')||
            (s.charAt(i)>='0'&& s.charAt(i)<='9'))// if(Character.isLetterOrDigit(c))
            {
                answer=answer+s.charAt(i);
                st.push(Character.toString(c));
            }
            else{
                String peek1=st.peek();
                st.pop();
                String peek2=st.peek();
                st.pop();
                answer="("+peek1+s.charAt(i)+peek2+")";
                st.push(answer);

            }
            i--;
        }
        return st.pop();

    }
    public static void main(String[] args) {
        String oldString="*+PQ-MN";
        System.out.println(prefixToInfixOrder(oldString));
    }
    
}
