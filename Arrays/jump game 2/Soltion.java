class Solution {
    public int jump(int[] nums) {
        int jumps=0,i=0,j=0,n=nums.length;
        while(j<n-1){
            int far=-1;
            for(int k=i;k<=j;k++){
                far=Math.max(far,k+nums[k]);
            }
            i=j+1;
            j=far;
            jumps++;
        }
        return jumps;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,3,1,1,4};
        System.out.println(sol.jump(nums)); // Output: 2
    }
}