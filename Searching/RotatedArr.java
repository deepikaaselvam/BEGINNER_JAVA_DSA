package Searching;
public class RotatedArr {
    public static int searchIntheRotatedSortedArray(int[]a,int target)
    {
        int l=0,r=a.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(a[mid]==target)
            {return mid;
            }
            if(a[l]<=a[mid])
            {
                if(a[l]<=target&&target<=a[mid])
                {
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else if(a[mid]<=a[r])
            {
                if(a[mid]<=target&&target<=a[r])
                {
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={7,8,9,1,2,3,4,5,6};
        int target=1;
        System.out.println(searchIntheRotatedSortedArray(arr,target));
    }
    
}
