
class Solution {
    static int valid(int left,int right){
        if(left==0)return 1;
        if(right<left)return 0;
        
        return valid(left-1,right)+valid(left,right-1);
    }
    int findWays(int n) {
       if(n%2!=0)return 0;
        return valid(n/2,n/2);
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int n=6;
        int result=s.findWays(n);
        System.out.println(result);
    }
}
