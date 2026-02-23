import java.util.HashMap;
class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k)return false;
        HashMap<String,Integer>s1=new HashMap<>();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<k;i++){
            s2.append(s.charAt(i));
        }
        String v=s2.toString();
        s1.put(v,1);
        int n=s.length();
        for(int i=1;i<=n-k;i++){
             s2.deleteCharAt(0);
             s2.append(s.charAt(i+k-1));
             String p=s2.toString();
             s1.put(p,s1.getOrDefault(p,0)+1);
        }
        
        return s1.size()==(1<<k);

    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.hasAllCodes("00110110",2));
    } 
}