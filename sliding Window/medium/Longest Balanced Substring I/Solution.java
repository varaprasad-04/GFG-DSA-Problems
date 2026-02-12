class Solution {
    static boolean isbalance(int[] freq){
        int count=0;
        for(int ele:freq){
            if(ele!=0){
                if(count==0){
                    count=ele;
                }
                else if(count!=ele)return false;
            }
        }
        return true;
    }
    public int longestBalanced(String s) {
        
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                if(isbalance(freq)){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="aabbcc";
        System.out.println(sol.longestBalanced(s));
    }
}