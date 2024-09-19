package StringsConcept;
import java.util.HashMap;
public class LSubString {
    public static void longestSubStringWithoutRepeatingCharacters(String str)
    {
        HashMap<Character,Integer>mpp=new HashMap<>();
        int l=0,r=0;
        int maxLength=0;
        while(l<=r &&r<str.length())
        {
            if(mpp.containsKey(str.charAt(r)))
            {
                l=Math.max(mpp.get(str.charAt(r))+1,l);
            }
            
            maxLength=Math.max(maxLength,r-l+1);
            mpp.put(str.charAt(r),r);
            r++;
        }
        System.out.println(maxLength);
    }
    public static void main(String[] args) {
        String s="pwwkew";
        longestSubStringWithoutRepeatingCharacters(s);
    }
    
}
