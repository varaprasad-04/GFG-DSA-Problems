class Solution {
    public int reverseBits(int n) {
       String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        StringBuilder s1=new StringBuilder(s);
        String a=s1.reverse().toString();
        int ans=Integer.parseInt(a,2);
        return ans;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int n=43261596;
        int result=s.reverseBits(n);
        System.out.println(result);
    }
}