import java.util.Arrays;    
class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int res=0,l=0,r=0;
        long tot=0;
        while(r<nums.length){
            tot+=nums[r];
            while((long)nums[r]*(r-l+1) > tot+k){
                tot-=nums[l];
                l++;
            }
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;

    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,4};
        int k = 5;
        System.out.println(s.maxFrequency(nums, k));
    }
}