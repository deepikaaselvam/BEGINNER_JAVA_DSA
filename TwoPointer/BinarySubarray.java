package TwoPointer;
public class BinarySubarray {
    public static int BinarySum(int[]arrray,int key)
    {
        int cnt=0,l=0,r=0;int n=arrray.length;
        int sum=0;
        for(r=0;r<n;r++)
        {
            sum+=arrray[r];
            while(l<r && sum>key){
                sum -=arrray[l];
                l++;
            }
            cnt=(cnt+(r-l+1));
        }
        return cnt;
    }
    public static void main(String[] args) {
        int Binarysumarray[]={1,0,1,0,1};
        int k=2;
        System.out.println(BinarySum(Binarysumarray,k)-BinarySum(Binarysumarray, k-1));
        
    }
}
