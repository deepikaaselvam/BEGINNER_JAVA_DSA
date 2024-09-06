package Stack;
import java.util.Stack;
public class ValidParan {
    public static boolean isvalid(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            
          
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                stack.add(s.charAt(i));
            }
           else{
            
            if(stack.isEmpty())
            {
                return false;
           
            }
            char c=stack.pop();
            if((s.charAt(i)==')'&& c!='(')|| 
            (s.charAt(i)==']'&&c!='[')||
            (s.charAt(i)=='}'&&c=='{'))
            {
                return false;
            }
           
           }
         }
         if(stack.isEmpty())
         {
            return true;
         }
        return false;
  

    }
    public static void main(String[] args) {
       
       
        String s = "()[]()";
        boolean answer=isvalid(s);
        System.out.println(answer);
       

    }
 }
    

