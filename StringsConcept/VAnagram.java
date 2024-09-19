package StringsConcept;
import java.util.HashMap;
public class VAnagram {
    public static boolean isAnagram(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer>mpp1=new HashMap<>();
        HashMap<Character,Integer>mpp2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
           mpp1.put(s.charAt(i), mpp1.getOrDefault(s.charAt(i),0)+1);
           mpp2.put(t.charAt(i), mpp2.getOrDefault(t.charAt(i),0)+1);
        }
        if(mpp1.equals(mpp2))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        boolean ans=isAnagram(s,t);
        System.out.println(ans+" ");
    }
    
}
