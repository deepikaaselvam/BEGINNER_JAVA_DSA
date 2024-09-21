package TwoPointer;
public class RevOddDigit {
    public static void main(String[] args) {
        String s="Hi this is Skillrack";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
               continue;
            }
            else{
                ans=ans+s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}