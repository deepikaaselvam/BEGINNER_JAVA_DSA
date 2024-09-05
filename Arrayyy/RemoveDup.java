package Arrayyy;
public class RemoveDup {
    public static void  RemoveDupli(int[]RemoveDuplicate,int j)
    {
        if(RemoveDuplicate.length==0)
        {
            System.out.print(RemoveDuplicate[0]+" ");
        }
        int i;
        System.out.print(RemoveDuplicate[0]+" ");
        for(i=1;i<RemoveDuplicate.length;i++)
        {
            if(RemoveDuplicate[i]!=RemoveDuplicate[j])
            {
                j++;
                RemoveDuplicate[j]=RemoveDuplicate[i];
                System.out.print(RemoveDuplicate[j]+" ");
            }
         }
    }
    public static void main(String[] args) {
        int[]RemoveDuplicate={1,1,2,2,2,3,3};
        int j=0;
       RemoveDupli(RemoveDuplicate,j);
       
    }
    
}
