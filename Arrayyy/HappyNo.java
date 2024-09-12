package Arrayyy;

public class HappyNo {
    public static boolean happyNumber(int n)//Error
    {
        int sum=0;
        while(n!=1)
        {
            sum=0;
            int quot=n/10,rem=n%10;
            sum=(quot*quot)+(rem*rem);
            n=sum;
           
        }
        if(n==1)
        {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        int n=19;
        System.out.println(happyNumber(n));
    }
    
}
