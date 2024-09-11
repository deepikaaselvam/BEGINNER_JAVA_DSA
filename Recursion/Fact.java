package Recursion;

public class Fact {
    public static long Factorail(long n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return n*Factorail(n-1);
    }
    public static void main(String[] args) {
        long n=5;
        System.out.println(Factorail(n));
    }
    
}
