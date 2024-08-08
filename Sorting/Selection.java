package Sorting;
public class Selection { //  All the testcases are passed🥺
    public static float[]SelectionSort(float []floatarr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(floatarr[j]<floatarr[min])
                {
                    min=j;
                }
            }
            float temp1=floatarr[min];
                floatarr[min]=floatarr[i];
                floatarr[i]=temp1;
        }
        return floatarr;
    }
    public static int[]SelectionSorttt(int[]integerarray,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int mini=i;
            for(int j=i+1;j<n;j++)
            {
                if(integerarray[j]<integerarray[mini]){
                mini=j;
                }
            }
            int temp2=integerarray[mini];
            integerarray[mini]=integerarray[i];
            integerarray[i]=temp2;
        }
        return integerarray;
    }
    public static void main(String[] args) {
    //Float Selection Sort
        float[]floatarray={3.1f, 2.2f, 1.5f, 4.0f, 2.9f};
        int n=floatarray.length;
        float result1[]=SelectionSort(floatarray,n);
        for(int i=0;i<result1.length;i++)
        {
            System.out.print(result1[i]+" ");
        }
    //Integer Selection Sort
        System.out.println();
        int[] intarray={64,25,12,22,11};
        int m=intarray.length;
        int result2[]=SelectionSorttt(intarray,m);
        for(int i=0;i<result2.length;i++)
        {
            System.out.print(result2[i]+" ");
        }
    }
    
}
