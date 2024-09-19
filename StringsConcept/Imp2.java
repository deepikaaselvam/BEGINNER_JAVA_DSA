package StringsConcept;

public class Imp2 {
    public static int lengthOftheLastWord(String str)
    {
        int len=0;
        for(int i=str.length()-1;i>0;i--)
        {
            if(str.charAt(i)==' ')
            {
                break;
            }
            else{
                len++;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String s="  fly me   to   the moon  ";
       int answer= lengthOftheLastWord(s);
       System.out.println(answer);
    }
    
}
