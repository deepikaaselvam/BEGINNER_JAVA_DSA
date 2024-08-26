package Contests;

public class PlaceFlower {
    public static boolean canPlaceFlower(int[]FlowerBed,int n)
    {
        int length=FlowerBed.length;
        
        for(int i=0;i<length;i++)
        {
            if(FlowerBed[i]==0)
            {
                if((i==0 || FlowerBed[i-1]==0)&&(i==FlowerBed.length-1 ||FlowerBed[i+1]==0))
                {
                    FlowerBed[i]=1;
                    n=n-1;
                }
            }
        }
           
        return n<=0;
    }
    public static void main(String[] args) {
        int array[]={1,1,1,0,0};
        int n=1;
        System.out.println(canPlaceFlower(array,n));
    }
    
}
