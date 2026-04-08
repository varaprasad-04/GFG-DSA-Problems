class Solution {
    int countStrings(int n) {
         if(n==1)return 2;
         if(n==2)return 3;
         int prev1=3;
         int prev2=2;
         for(int i=3;i<=n;i++){
             int cur=prev1+prev2;
             prev2=prev1;
             prev1=cur;
         }
         return prev1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int result = solution.countStrings(n);
        System.out.println(result); // Output: 8
    }
}