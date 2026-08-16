class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int rob[]=new int[n+1];
        rob[0]=0;
        rob[1]=nums[0];
        for(int i=1;i<n;i++){
            rob[i+1]=Math.max(rob[i],nums[i]+rob[i-1]);
        }
        return rob[n];
    }
}