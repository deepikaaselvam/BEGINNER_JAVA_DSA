package TwoPointer;

public class CharOpRe {
    public static int CharactreOptimalReplacement(String s,int key)
    {
        int maxLen=0;int maxFreq=0,l=0,r=0;
        int hash[]=new int[26];
        for( r=0;r<s.length();r++)
        {
            hash[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,hash[s.charAt(r)-'A']);
            while((r-l+1)-maxFreq>key)
            {
                hash[s.charAt(l)-'A']--;
                // maxFreq=0;
                // for(int i=0;i<s.length();i++)
                l++;

            }
            if((r-l+1)-maxFreq<=key)
            {
                maxLen=Math.max(maxLen,(r-l+1));
            }
        }

        return  maxLen; 
    }
    public static void main(String[] args) {
        String str="AABABBC";
        int k=2;
        System.out.println(CharactreOptimalReplacement(str,k));
    }
    
}
