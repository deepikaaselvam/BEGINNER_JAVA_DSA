package Stack;
import java.lang.StringBuilder;
public class InfixToPrefix {
    public static void main(String[] args) {
        String s="(A+B)*C-D+E";
        StringBuilder sb=new StringBuilder(s);
        StringBuilder stringg=sb.reverse();
        System.out.println(stringg);
    }
}
