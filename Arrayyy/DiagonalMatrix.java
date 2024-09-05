package Arrayyy;
// import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;int n=array.length;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i][i];
                if(i!=n-i-1)
                {
                    sum+=array[i][n-i-1];
                }
        }
        System.out.print(sum);
        }
        
    }
    

