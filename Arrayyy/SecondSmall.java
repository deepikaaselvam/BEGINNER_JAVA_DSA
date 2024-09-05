package Arrayyy;

public class SecondSmall {
    public static int SecondSmallestElement(int []arrayy)
    {
        int Secondsmall=Integer.MAX_VALUE;//when both positive and negative elements present put it as Integer.MAX_VALUE
        int smallest=Integer.MAX_VALUE;
        int n=arrayy.length;
        for(int i=0;i<n;i++)
        {
            if(arrayy[i]<smallest)
            {
                Secondsmall=smallest;
                smallest=arrayy[i];
            }
            else if(arrayy[i]>smallest &&arrayy[i]<Secondsmall)
            {
                Secondsmall=arrayy[i];
            }
            
        }
        return Secondsmall;

    }
    public static void main(String[] args) {
        int array[]={-1,-2,9,5,4};
        System.out.println(SecondSmallestElement(array));
    }
    
}
