package Contests;
import java.lang.String;
public class Subsequ {
    public boolean isSubsequence(String s, String t) {
        int l=0,r=0;
        while(l<s.length() &&r<t.length())
        {
            if(s.charAt(l)==t.charAt(r))
            {
                l++;
                r++;
            }
            else{
                r++;
            }
            
        }
       
        return (l==s.length());
      
    }
   
        
    public static void main(String[] args) {
        String s1="abc";
        String s2="ahbgdc";
        Subsequ s=new Subsequ();
        boolean subseq= s.isSubsequence(s1,s2);
        System.out.println(subseq);
       
           
            
        }
    }
    

