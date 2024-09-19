package Contests;

public class PreSucc {
    public static void preceddorAndSuccedor(int[]array)
    {
        int x=5;
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[x-1]+" "+array[x]+" "+array[x+1]);
            return;
        }
    }
    public static void main(String[] args) {
        // int num=7;
        int[]array={12,23,89,90,87,65,78};
        preceddorAndSuccedor(array);
       
    }
    
}
