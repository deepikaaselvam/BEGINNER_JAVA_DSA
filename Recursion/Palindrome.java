package Recursion;

public class Palindrome {
    
    public static boolean  func(int i,String str)
    {
        int n=str.length();
        if(str.charAt(i)!=str.charAt(n-i-1))
        {
            return false;
        }
        if(i>n/2)
        {
            return true;
        }
        
        
        return func(i+1,str);
    }
    public static void main(String[] args) {
        String s="MADaM";
        System.out.println(func(0,s));
    }
    
}
