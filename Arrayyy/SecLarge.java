package Arrayyy;
public class SecLarge {
    public static int SecondLargestElement(int []arr)
    {
        int secondLarge=Integer.MIN_VALUE; ///all testcases are passed
        int n=arr.length;
        int THirdLarge=Integer.MIN_VALUE;
        int maxi=arr[0]; //Integer.MIN_VALUE also accepted;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>maxi)
            {
                THirdLarge=secondLarge;
                secondLarge=maxi;
                maxi=arr[i];
            }
            else if(arr[i]<maxi && arr[i]>secondLarge && secondLarge>THirdLarge)
            {
                THirdLarge=secondLarge;
                secondLarge=arr[i];
            }

        }
        return THirdLarge;
        // return secondLarge;
    }
    public static void main(String[] args) {
         int a[]={1, 3, 4, 6, 8, 9, 11, 15, 20, 25, 30, 35, 40,  55, 60,65, 78, 70};
         System.out.println(SecondLargestElement(a));
    }
    
}
