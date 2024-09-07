package Stack;
import java.util.Stack;
import java.lang.StringBuilder;
public class InfixToPrefix {
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
        }
        // System.out.println(stringg);
    }
}
