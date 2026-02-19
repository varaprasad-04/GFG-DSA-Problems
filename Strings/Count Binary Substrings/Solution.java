class Solution {
    public int countBinarySubstrings(String s) {
        int count=0,prev=0,cur=1,i=1;
        while(i<s.length()){
            if(s.charAt(i-1)!=s.charAt(i)){
                count+=Math.min(prev,cur);
                prev=cur;
                cur=1;
            }
            else cur++;

            i++;
        }
        return count+Math.min(cur,prev);
    }
    public static void main(String[] args) {
        String s="00110011";
        Solution s1=new Solution();
        int result=s1.countBinarySubstrings(s);
        System.out.println(result);
    }
}