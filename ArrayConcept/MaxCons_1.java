package ArrayConcept;

public class MaxCons_1 {
    public static void main(String[] args) {
        int[]array={1,1,1,0,0,0,1,1,1,1,0};
        int cnt=0,maxSum=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==1){
                cnt++;
                maxSum=Math.max(maxSum,cnt);
            }else{
            cnt=0;}
        }
        System.out.println(maxSum);
    }
    
}
