class Solution {
    public int titleToNumber(String s) {
        int result=0;
        for(char ch:s.toCharArray()){
            result=result*26+(ch-'A'+1);
        }
        return result;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        String str="ZY";
        System.out.println(s.titleToNumber(str));
    }
}