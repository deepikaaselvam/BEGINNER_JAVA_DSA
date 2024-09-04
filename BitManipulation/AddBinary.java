package BitManipulation;
import java.util.Arrays;
public class AddBinary {
    public static int[] addBinaryNumbers(String a,String b)
    {
        int m=a.length();
        int n=b.length();
        int s=Math.max(m,n);
        int number[]=new int[s];
        for(int i=a.length();i>0;i--)
        {
            number[i]=a.charAt(i)^b.charAt(i);
        }
        return number;
        
    }
    public static void main(String[] args) {
        String a="11";
        String b="1";
        int answer[]=addBinaryNumbers(a,b);
        System.out.println(Arrays.toString(answer));
    }
    
}
