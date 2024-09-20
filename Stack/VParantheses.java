package Stack;
import java.util.Stack;
import java.util.ArrayList;
public class VParantheses {
    public static void main(String[] args) {
        Stack<Character>st=new Stack<>();
        ArrayList<Character>list=new ArrayList<>();
        String s="(()())";
        char[]CharArray=s.toCharArray();
     
        for(int i=0;i<CharArray.length;i++)
        {
            st.push(CharArray[i]);
        }
        for(int i=st.size()-1;i>=0;i--)
        {
            if(s.charAt(i)=='(')
            {
                 if(s.charAt(i)=='(' && s.charAt(i+1)!=')')
                 {
                    st.pop();
                 }
            }
           if(s.charAt(i)==')')
           {}
           if(s.charAt(i)==')'&& s.charAt(i-1)!='(')
            {
                st.pop();
            }
        }
         
            else{
               list.add(st.peek());
               st.pop();
            }
        }
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i));
        }
       
    }
    
}
