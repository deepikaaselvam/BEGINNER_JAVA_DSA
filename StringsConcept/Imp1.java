package StringsConcept;
public class Imp1 {
    public static boolean ValidStringPalindrome(String s)
    {
        String newString=s.replaceAll("[^a-zA-Z0-9]","");//^= negation ,Replacing Character should not be a-z,A-Z and 0-9
        String newAnswerString=newString.toLowerCase();
        char[]charArrayyy=newAnswerString.toCharArray();
        int left=0,right=charArrayyy.length-1;
        while(left<=right)
        {
            if(charArrayyy[left]!=charArrayyy[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        boolean ans=ValidStringPalindrome(s);
        System.out.println(ans);
    }
    
}
