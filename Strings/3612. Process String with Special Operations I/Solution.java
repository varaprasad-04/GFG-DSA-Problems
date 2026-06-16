class Solution {
    public String processStr(String s) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0 && ch=='*')continue;
            if(ch=='*' && s1.length()==0)continue;
            if(ch>='a' && ch<='z')s1.append(ch);
            else if (ch=='*')s1.deleteCharAt(s1.length()-1);
            else if(ch=='#')s1.append(s1);
            else if(ch=='%')s1.reverse();
        }
        return s1.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "ab*c#d%";
        String result = sol.processStr(input);
        System.out.println(result); // Output the result
    }   
}