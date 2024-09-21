package Searching;

public class FLOccurence {//It is the Brute Force Approach!!
    public static String firstAndLastOccurence(int[]array,int target)
    {
        int first=-1;
        int last=-1;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==target)
            {
                if(first==-1)
                {
                    first=i;
                }
                last=i;
            }
        }
        return first+" "+last;
    }
    public static void main(String[] args) {
        int[]array={2,4,6,8,8,8,8,11,32};
        int target=8;
        System.out.println(firstAndLastOccurence(array,target));
        
    }
    
}
