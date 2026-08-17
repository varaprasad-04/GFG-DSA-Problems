class Solution {
    public String countAndSay(int n) {
        String s="1";
        if(n==1)return s;
        
        for(int i=1;i<n;i++){
            int c=1;
            StringBuilder ans=new StringBuilder();
            int j=1;
           while(j<s.length()){
                if(s.charAt(j-1)==s.charAt(j))
                    c++;
                else {
                    ans.append(c);
                    ans.append(s.charAt(j-1));
                    c=1;
                }
                j++;
           }
            ans.append(c);
            ans.append(s.charAt(j - 1));
           s=ans.toString();
           
        }
        return s;
    }
}