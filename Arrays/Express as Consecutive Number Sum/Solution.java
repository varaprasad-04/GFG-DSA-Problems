class Solution {
    public boolean isSumOfConsecutive(int n) {
        // code here
        //if(n==1)return false;
        while(n%2==0){
            n=n/2;
        }
       if(n==1)return false;
       return true;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isSumOfConsecutive(15));
    }   
}