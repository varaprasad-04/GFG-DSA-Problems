class Solution {
    public int maxSum(int n) {
       if(n==0)return 0;
       
       int val=maxSum(n/2)+maxSum(n/3)+maxSum(n/4);
       
       return Math.max(n,val);
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int n=12;
        System.out.println(sol.maxSum(n));
    }
}
