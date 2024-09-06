package Arrayyy;
import java.util.ArrayList;
public class DupOccur {
    public static ArrayList<Integer> morethanOneTimeOccur(int[]newArray)
    {
        ArrayList<Integer>arr=new ArrayList<>();
        int i=0;
        for(int j=1;j<newArray.length;j++)
            {
                if(newArray[i]==newArray[j])
                {
                   arr.add(newArray[i]);
                   i++;

                }
            }
            return -1; 
        }
       

    
    public static void main(String[] args) {
        int[]array={2,3,3,3,1,2,3};
     
        morethanOneTimeOccur(array);

      
        
       
    }
}
    

