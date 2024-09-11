package Recursion;

public class Backtrack2 {
    public static void backtrackfromLasttoFirst(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        backtrackfromLasttoFirst(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int i=1;
        int n=5;
        backtrackfromLasttoFirst(i,n);
    }
    
}
