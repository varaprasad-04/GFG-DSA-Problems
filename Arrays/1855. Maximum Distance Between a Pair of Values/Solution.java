class Solution{
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans=0;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                 ans=Math.max(ans,(j-i));
                 j++;
            }
            else i++;
        }
        return ans;
    }
        public static void main(String[] args) {
            Solution s = new Solution();
            int[] nums1 = {1, 2, 3};
            int[] nums2 = {3, 4};
            System.out.println(s.maxDistance(nums1, nums2)); // Output: 2
        }
}