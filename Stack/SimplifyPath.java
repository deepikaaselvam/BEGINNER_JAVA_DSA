package Stack;
import java.util.Stack;
import java.lang.StringBuilder;
public class SimplifyPath {
    public static String convertintoSimplePath(String s)
    {
        Stack<String>st=new Stack<>();
        String[]Array=s.split("/");
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<Array.length)
        {
            if(!st.isEmpty()&&Array[i].equals(".."))
            {
                st.pop();
            }
            else if(!Array[i].equals("..") 
            &&!Array[i].equals("")&&!Array[i].equals(".")){
                st.push(Array[i]);
            }
          i++;
        }
        if(st.isEmpty())
        {
            return "/";
        }
        while(!st.isEmpty())
        {
            sb.insert(0,st.pop()).insert(0, "/");
        }
       
       
      return sb.toString();
      
    }
    public static void main(String[] args) {
        
        String s="/home/users/../users2/Documentsfile.txt";
        
        String q=convertintoSimplePath(s);     ///It will be solved by using the store the diffreent values
        System.out.println(q.toString());        //in the "String array,pass 1 by 1 and find calculate for all the inputes"
        s="/a/./b/../../c/";
       q=convertintoSimplePath(s);
        System.out.println(q.toString());
        
    }
   
    
}
