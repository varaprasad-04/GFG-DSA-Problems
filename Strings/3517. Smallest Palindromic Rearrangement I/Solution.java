class Solution {
    public String smallestPalindrome(String s) {
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder l=new StringBuilder();
        char middle=0;
        for(int i=0;i<26;i++){
            int p=freq[i]/2;
            for(int j=0;j<p;j++){
                l.append((char)(i+'a'));
            }
            if(freq[i]%2==1)middle=(char)(i+'a');
        }
        String r=new StringBuilder(l).reverse().toString();
        if(middle!=0)return l.toString()+middle+r;

        return l.toString()+r;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aaabbbb";
        System.out.println(sol.smallestPalindrome(s)); // Output: "abbbba"
    }   
}