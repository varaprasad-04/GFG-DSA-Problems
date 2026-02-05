import java.util.Arrays;
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0)res[i]=0;
            else {
                if(nums[i]>0){
                    res[i]=nums[(i+nums[i])%n];
                }
                else res[i]=nums[((i+nums[i])%n+n)%n];
            }
        }
        return res;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int nums[]={2,4,1,3,0};
        int result[]=s.constructTransformedArray(nums);
        System.out.println(Arrays.toString(result));
    }
}