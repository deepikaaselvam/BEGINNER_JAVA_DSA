package Contests;
import java.util.Arrays;
class PlusOne {
    public static int[]addPlusOne(int[]digits)
    {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
                
            }
            digits[i]=0;
        }
        int newArray[]=new int[digits.length+1];
        newArray[0]=1;
        return newArray;
    }
    public static void main(String[] args) {
        int digits[]={4,9,9,9};
       int[]ans=addPlusOne(digits);
       System.out.println(Arrays.toString(ans));
        
       
            }
        }
        

        
    


