class Solution {
    public String chooseSwap(String s) {
        int freq[]=new int[26];
        char ch[]=s.toCharArray();
        for(int i=0;i<26;i++)freq[i]=-1;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            if(freq[ind]==-1)freq[ind]=i;
           
        }
        for(int i=0;i<ch.length;i++){
            int ind=ch[i]-'a';
            for(int j=0;j<ind;j++){
                if(freq[j]>i){
                    char g=(char)(j+'a');
                    char f=ch[i];
                    for(int k=0;k<ch.length;k++){
                        if(ch[k]==g)ch[k]=f;
                        else if(ch[k]==f)ch[k]=g;
                    }
                    return new String(ch);
                }
            }
            
            
        }
        return s;
        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "ccad";
        String result = sol.chooseSwap(s);
        System.out.println(result); // Output: "aacd"
    }   
}