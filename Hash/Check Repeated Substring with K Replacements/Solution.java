import java.util.HashMap;
class Solution {
    public boolean kSubstr(String s, int k) {
        HashMap<String,Integer>s1=new HashMap<>();
        int maxfre=-1;
        int blocks = s.length() / k;
        for(int i=0;i<=s.length()-k;i+=k){
            String sub=s.substring(i,i+k);
            if(s1.containsKey(sub)){
                s1.put(sub,s1.getOrDefault(sub,0)+1);
            }
            else s1.put(sub,1);
            
            maxfre=Math.max(maxfre,s1.get(sub));
        }
        if(maxfre>=blocks-1)return true;
        
        return false;
        
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.kSubstr("abcabc",3));
    }
}