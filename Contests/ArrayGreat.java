package Contests;

public class ArrayGreat {
    
        public static boolean canAliceWin(int[] nums) {
            int n=nums.length;int sum1=0,sum2=0;
            for(int i=0;i<n;i++)
            {
               if(nums[i]>=0 && nums[i]<10)
               {
                   sum1+=nums[i];
               }
                else
                {
                    sum2+=nums[i];
                }
            }
            if(sum1>sum2)
                return true;
            else if(sum2>sum1)
                return true;
            else
                return false;
            
        }
        public static void main(String[] args) {
            int[]array={1,2,3,4,5,14};
            System.out.println(canAliceWin(array));
        }
    }
    

