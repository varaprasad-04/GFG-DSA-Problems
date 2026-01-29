import java.util.*;
class Solution {
    public String firstNonRepeating(String s) {
       LinkedHashMap<Character,Integer>s1=new LinkedHashMap<>();
       StringBuilder ans=new StringBuilder();
       for(int i=0;i<s.length();i++){
           s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
           for(Map.Entry<Character,Integer> e:s1.entrySet()){
               int v=e.getValue();
               char c=e.getKey();
               if(v==1){
                   ans.append(c);
                   break;
               }
           }
           if(ans.length()!=i+1)ans.append('#');
       }
       return ans.toString();
    }
    public static void main(String args[]){
        Solution s=new Solution();
        String str="aabc";
        String result=s.firstNonRepeating(str);
        System.out.println(result);
    }
}