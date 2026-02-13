class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n==3)return false;
        int i=1;
        while(i<n && nums[i]>nums[i-1]){
            i++;
        }
        if(i==1)return false;
        if(i==n)return false;
        while(i<n && nums[i]<nums[i-1]){
            i++;
        }
        if(i==n)return false;
        while(i<n && nums[i]>nums[i-1]){
            i++;
        }
        return (i==n);
       
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 3, 2, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {5, 4, 3, 2, 1};
        int[] nums4 = {1, 3, 5, 4, 2};

        System.out.println(sol.isTrionic(nums1)); // true
        System.out.println(sol.isTrionic(nums2)); // false
        System.out.println(sol.isTrionic(nums3)); // false
        System.out.println(sol.isTrionic(nums4)); // false
    }
}