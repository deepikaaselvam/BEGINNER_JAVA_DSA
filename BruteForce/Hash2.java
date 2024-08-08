package BruteForce;

public class Hash2 {
    public static int[] FrequencyCountElement(int[]arra)
    {
        //Frequency Count using hash array
        int n=arra.length;
        int hashCount[]=new int[10];
        for(int i=0;i<n;i++){
            hashCount[arra[i]]++;//Pre-Storing
        }//Fetching
        // for(int i=0;i<arra.length;i++)
        // {
        //     System.out.println(i+" "+hashCount[i]);//fetching

        // }
        return hashCount;
        
        
    }
    public static void main(String[] args) {
        int hashArray[]={1,2,1,1,3,2,4};
       
        for(int frequencies: FrequencyCountElement(hashArray))
        {
            System.out.print(frequencies+" ");
        }
    }
    
}
