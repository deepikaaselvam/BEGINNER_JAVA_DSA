package BruteForce;

public class HashChar1 {
    public static int FreqCount(String s,char charr)
    {
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==charr)
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String str="abcdaaaaabedf";
        char character='a';
        System.out.println(FreqCount(str,character));
    }
    
}
