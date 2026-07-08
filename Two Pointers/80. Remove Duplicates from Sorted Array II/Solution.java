class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<2)return n;
        int write=2;
        for(int i=2;i<n;i++){
            if(nums[i]!=nums[write-2]){
                nums[write]=nums[i];
                write++;
            }
        }
        return write;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={1,1,1,2,2,3};
        int len=s.removeDuplicates(nums);
        System.out.println(len);
}