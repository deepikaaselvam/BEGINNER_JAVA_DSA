package Recursion;

public class Backtrack1 {
    public static void function(int i, int n)
    {
        if(i<1)
        {
            return;
        }
        function(i-1, n);
        System.out.println(i);

    }
    public static void main(String[] args) {
        int n=3;
        function(n,n);
    }
    
}
