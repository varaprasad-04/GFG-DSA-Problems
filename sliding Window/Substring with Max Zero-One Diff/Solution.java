class Solution {
    int maxSubstring(String s) {
        // code here
         int one=0,zero=0,ans=-1;
         for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             if(ch=='0')zero++;
             else one++;
             
             ans=Math.max(ans,zero-one);
             if(zero-one<0){
                 zero=0;
                 one=0;
             }
             
         }
         return ans;
    }
    public static void main(String args[]){
        Solution obj = new Solution();
        System.out.println(obj.maxSubstring("00110011")); // Example test case
    }
}