package Contests;
import java.util.ArrayList;
public class KidCandies {//successs
    public static ArrayList<Boolean>findKidWithCandies(int[]Candies,int ExtraCandies)
    {
        int n=Candies.length;
        
        ArrayList<Boolean>BoolArray=new ArrayList<>();
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            if(Candies[i]>maxi)
            {
                maxi=Candies[i];
            }
        }
            for(int i=0;i<n;i++)
            {
            if(Candies[i]+ExtraCandies>=maxi)
            {
                BoolArray.add(true);
             
            }
            else{
                BoolArray.add(false);
              
            }
        }
        return BoolArray;
        
    }
    public static void main(String[] args) {
        int[]array={4,2,1,1,2};
      
       int ExtraCandies=1;
        System.out.println(findKidWithCandies(array,ExtraCandies));
    }
    
}
