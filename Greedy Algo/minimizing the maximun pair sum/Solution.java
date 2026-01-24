import java.util.Arrays;
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,l=0,r=n-1;
        int ans=0;
        while(l<r){
            ans=Math.max(ans,nums[l]+nums[r]);
            l++;r--;
        }
        return ans;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int nums[]={3,5,2,3};
        int result=s.minPairSum(nums);
        System.out.println(result);
    }
    
}