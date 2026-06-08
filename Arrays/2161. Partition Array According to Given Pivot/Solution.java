class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        int i=0,j=nums.length-1;
        int l=0,r=nums.length-1;
        while(i<nums.length && j>=0){
            if(nums[i]<pivot ){
                ans[l++]=nums[i];
            }
             if(nums[j]>pivot){
                ans[r--]=nums[j];
             }
             i++;
             j--;
        }
        while(l<=r){
            ans[l++]=pivot;
            
        }
        return ans;
    }
    public static void main(String args[]){
        Solution obj = new Solution();
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        int[] result = obj.pivotArray(nums, pivot);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}