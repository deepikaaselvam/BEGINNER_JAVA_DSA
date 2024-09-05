package Arrayyy;
// import java.util.Arrays;

public class InsertArray {
    public static void main(String[] args) {
        int[]array={1,2,4,5};
        int n=array.length;
        // int newArray[]=new int[n+1];
        int pos=2,element=3;
        for(int i=n-1;i>=pos;i--)
        {
            
            array[i+1]=array[i];
            array[pos]=element;
            n++;
            
        }
        for(int i=0;i<n;i++)
        System.out.print((array[i]+" "));
        
    }
    
}
