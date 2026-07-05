class Solution {
    String expand(int i,int j,String s){
        while(i>=0 && j<s.length()){
            if(s.charAt(i)!=s.charAt(j))break;
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
    public String getLongestPal(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            String odd=expand(i,i,s);
            String even=expand(i,i+1,s);
            
           if (odd.length() > ans.length())
                ans = odd;

            if (even.length() > ans.length())
                ans = even;
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "babad";
        String result = solution.getLongestPal(s);
        System.out.println(result);  // Output: "bab" or "aba"
    }   
}