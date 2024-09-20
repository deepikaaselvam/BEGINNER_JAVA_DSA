package Stack;
import java.util.Stack;
public class RevWord {
    public static void main(String[] args) {
        Stack<String>st=new Stack<>();
        String s="This is Decent";
        String newString="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                newString=newString+s.charAt(i);
            }
            else{
                st.push(newString);
                newString=" ";
            }
        }
        st.push(newString);
        while(!st.isEmpty())
        {
            System.out.print(st.pop()+" ");
           
        }
    }

    
}
