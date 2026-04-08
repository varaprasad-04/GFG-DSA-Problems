class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            int in=queries[i][0];
            while(in<=queries[i][1]){
                nums[in] = (int)((nums[in] *1L* queries[i][3]) % 1000000007);
                in+=queries[i][2];
            }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int[][] queries = {{0, 4, 1, 2}, {1, 3, 2, 3}};
        int result = solution.xorAfterQueries(nums, queries);
        System.out.println("XOR after queries: " + result);
    }
}