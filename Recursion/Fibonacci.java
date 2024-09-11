package Recursion;

public class Fibonacci {
    public static int fibonacciOfNumber(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return fibonacciOfNumber(n-1)+fibonacciOfNumber(n-2);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibonacciOfNumber(n));
    }
    
}
