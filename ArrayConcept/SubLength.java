package ArrayConcept;
public class SubLength {
    public static void main(String[] args) {
      
        int count=0;
        int[]a={2,4,5,6,12};int n=a.length;int k=18;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+a[j];
                if(sum==k)
                {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
    
}
