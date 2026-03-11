class Solution {
    public boolean judgeSquareSum(int c) {
        long s=0,e=(long)Math.sqrt(c);
        while(s<=e){
            long sum=(s*s)+(e*e);
            if(sum==c)return true;
            if(sum<c)s++;
            else e--;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.judgeSquareSum(5));
        System.out.println(sol.judgeSquareSum(3));
    }
}