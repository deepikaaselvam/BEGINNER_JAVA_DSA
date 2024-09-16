package Arrayyy;

public class Unique {
    public static int uniqueNumbers(int[]arrayy)
    {
        int ans=0;
        for(int i=arrayy.length-1;i>=0;i--)
        {
            ans=ans^arrayy[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int []array={3,3,5,5,4,4,9,9,9,9,2};
        System.out.println(uniqueNumbers(array));
    }
    
}
