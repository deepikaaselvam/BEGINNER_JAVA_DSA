package BruteForce;

public class Hash1 {
    public static int[] FrequencyCount(int[]arr,int[]freq)
    {
        int cnt=0;
        int[]result=new int[freq.length];
        for(int i=0;i<freq.length;i++)
        {
            cnt=0;
            for(int j=0;j<arr.length;j++)
            {
                if(freq[i]==arr[j])
                {
                    cnt++;
                }
             }
            result[i]=cnt;
            }
           return result;
        }
        public static void main(String[] args) {
        int[]array={1,2,1,1,39,9,3,3,3,2,4};
        int frequency[]={1,2,3};
        int result[]=FrequencyCount(array,frequency);
        for(int i=0;i<result.length;i++)
       System.out.println(frequency[i]+" "+result[i]);
    }
    
}
