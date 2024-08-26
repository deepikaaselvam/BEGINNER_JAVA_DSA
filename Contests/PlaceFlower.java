package Contests;

public class PlaceFlower {
    public static boolean canPlaceFlower(int[]FlowerBed,int n)
    {
        int length=FlowerBed.length;
        int cnt=0;
        for(int i=0;i<length;i++)
        {
            if(FlowerBed[i]==0)
            {
                if((i==0 || FlowerBed[i-1]==0)&&(i==FlowerBed.length-1 ||FlowerBed[i+1]==0))
                {
                    cnt++;
                }
            }
            if(cnt==n)
            {
                return true;
            }
           
        }
        return false;
    }
    public static void main(String[] args) {
        int array[]={1,0,0,0,1};
        int n=1;
        System.out.println(canPlaceFlower(array,n));
    }
    
}
