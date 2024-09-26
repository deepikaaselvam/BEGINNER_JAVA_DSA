package Patterns;

public class Inverse {
    public static void main(String[] args) {
        int n=5;
        char Alpha='a';
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n-i;j++)
           {
                System.out.print("- ");
           }
           for(int j=n-i+1;j<=n;j++)
           {
                System.out.print(Alpha--+" ");
           }
           Alpha +=(i+1);
            System.out.println();
        }
    }
    
}
