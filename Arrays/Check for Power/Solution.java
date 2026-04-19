class Solution {
    public boolean isPower(int x, int y) {
      if(x==1)return y==1;
      while(y%x==0){
          y/=x;
      }
      return y==1;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 2, y = 8;
        System.out.println(s.isPower(x, y)); // Output: true
    }
}