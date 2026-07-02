import java.util.*; 
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length()==1 && s.length()==1)return true;
        HashMap<Character,String>s1=new HashMap<>();
         HashMap<String,Character>s2=new HashMap<>();
         String arr[]=s.split(" ");
         if(arr.length!=pattern.length())return false;
        for(int i=0;i<pattern.length();i++){
             char ch=pattern.charAt(i);
             if(s1.containsKey(ch)){
                String v=s1.get(ch);
               if(!v.equals(arr[i]))return false;
             }
             else{
                s1.put(ch,arr[i]);
             }
             if(s2.containsKey(arr[i])){
                if(s2.get(arr[i])!=ch)
                    return false;
             }
             else 
                s2.put(arr[i],ch);
        }
        //if(s2.size()!=s1.size())return false;
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = solution.wordPattern(pattern, s);
        System.out.println(result);  // Output: true
    }
}