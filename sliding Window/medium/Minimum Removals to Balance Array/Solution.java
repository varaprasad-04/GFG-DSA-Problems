import java.util.*;
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=0,max=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]<=(long)k*(long)nums[l]){
               
                max=Math.max(max,r-l+1);
                 r++;
            }
                
            else l++;
        }
       
        return n-max;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={1,2,3,4,5};
        int k=2;
        System.out.println(s.minRemoval(nums, k));
    }
}