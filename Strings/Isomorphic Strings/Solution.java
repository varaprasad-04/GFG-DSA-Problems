import java.util.HashMap;
class Solution {
    public boolean areIsomorphic(String s1, String s2) {
      HashMap<Character,Character>s=new HashMap<>();
      for(int i=0;i<s1.length();i++){
          if(!s.containsKey(s1.charAt(i))){
              s.put(s1.charAt(i),s2.charAt(i));
          }
          else{
              if(s.get(s1.charAt(i))!=s2.charAt(i))return false;
          }
      }
      HashMap<Character,Character>p=new HashMap<>();
      for(int i=0;i<s2.length();i++){
          if(!p.containsKey(s2.charAt(i))){
              p.put(s2.charAt(i),s1.charAt(i));
          }
          else{
              if(p.get(s2.charAt(i))!=s1.charAt(i))return false;
          }
      }
      return true;
       
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "egg";
        String s2 = "add";
        System.out.println(sol.areIsomorphic(s1, s2)); // Output: true
    }
}