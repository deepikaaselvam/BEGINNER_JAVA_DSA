package Contests;
// import java.util.ArrayList;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the end of nums1 (the place to start merging)

        // Merge nums1 and nums2 from the back to avoid overwriting elements in nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
             
                nums1[k] = nums1[i];
                i--;
          
            } else {
               
           
                nums1[k] = nums2[j];
                j--;
      
            }
            k--;
        }

        // If there are remaining elements in nums2, add them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }


    public static void main(String[] args) {
        int[]array1={1,2,3};
        int[]array2={2,5,6};
        int m=array1.length,n=array2.length;
        Solution s=new Solution();
        s.merge(array1,m,array2,n);
    }
} 
