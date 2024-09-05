package Arrayyy;

public class Basic {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};int n=a.length;
      int b[]=new int[n];
      b=a;
      a[0]=99999;
      for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
        System.out.println();
        b=new int[]{5,6,7,8,9};
        for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
    }
    
}
