package StringsConcept;
public class Anagramm {
    public static boolean isAnagram(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }

        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        boolean s=isAnagram(s1,s2);
        System.out.println(s);

    }
    
}
