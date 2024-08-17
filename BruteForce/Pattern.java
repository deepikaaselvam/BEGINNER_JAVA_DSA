package BruteForce;

public class Pattern {
    public static void main(String[] args) {
        int n1=1,n2=5;
        int len=n2-n1+1;
        for(int i=1;i<=len;i++)
        {
            for(int j=n1;j<=n2-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
