package Searching;

public class Ceil {
    public static int ceilValue(int[]array,int target)
    {
        int l=0,r=array.length-1;
        int answer=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(array[mid]>=target)
            {
                answer=array[mid];
                r=mid-1;
                
            }
            else{
                l=mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[]array={10,20,30,40,50};
        int target=25;
        System.out.println(ceilValue(array,target));;
    }
    
}
