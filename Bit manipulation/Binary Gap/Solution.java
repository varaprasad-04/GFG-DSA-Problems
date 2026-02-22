class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int f=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'==1){
                f=i;
                break;
            }
        }
        int len=0;
        for(int i=f+1;i<s.length();i++){
            if(s.charAt(i)-'0'==1){
                len=Math.max(len,i-f);
                f=i;
            }
        }
        return len;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int n=22;
        int result=s.binaryGap(n);
        System.out.println(result);
    }
}