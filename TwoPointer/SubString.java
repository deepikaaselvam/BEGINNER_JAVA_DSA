package TwoPointer;
import java.util.HashSet;
public class SubString {
    public static int LongSubStringWORepeatingCharacter(String str)
    {
        int n=str.length();int maxans=Integer.MIN_VALUE;
        if(str.length()==0)
        {
            return 0;
        }
        for(int i=0;i<n;i++)
        {
            HashSet<Character>se= new HashSet<>();
            for(int j=i;j<n;j++)
            {
                if(se.contains(str.charAt(j)))
                {
                    maxans=Math.max(maxans,j-i);
                    // j=j-i+1;
                    break;
                }
                se.add(str.charAt(j));
            }
        }
        return maxans;
}
    public static void main(String[] args) {
        String s="abcaabcdba";
        System.out.println(LongSubStringWORepeatingCharacter(s));
    }
}
