package Contests;

public class ReverseNo {
    public static int  reverse(int number)
    {
        int reversedNumber=0;
        while(number!=0)
        {
            int remainder=number%10;
            if(reversedNumber>Integer.MAX_VALUE/10||(reversedNumber==Integer.MAX_VALUE&& remainder>7))
            {
                return 0;
            
            }
            else if(reversedNumber<Integer.MIN_VALUE/10 ||(reversedNumber==Integer.MIN_VALUE&& remainder<-8))
            {
                return 0;
            }
            reversedNumber=reversedNumber*10+remainder;
            number=number/10;

        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        int x=1534236469;
        System.out.print(reverse(x));;
    }
    
}
