package TwoPointer;
import java.util.Collections;
import java.util.ArrayList;
public class Leader {//All Testcases are passed
    public static void main(String[] args) {
        int[]arr={1000, 2000, 3000, 1000, 200};//10, -4, 3, 7, -2, 5, -8, 2
        int n=arr.length;
        ArrayList<Integer>res=new ArrayList<>();
        res.add(arr[n-1]);
        int l=n-2,max=arr[n-1];
        while(l>=0)
        {
            if(arr[l]>max)
            {
                res.add(arr[l]);
                max=arr[l];//update the max value @ every tym!
               
            }
            l--;
        }
        Collections.reverse(res);//reverse the leader element and return it in the order!!

        for(int i=0;i<res.size();i++)
        {
            System.out.print(res.get(i)+" ");
        }
       
    }
    
}

