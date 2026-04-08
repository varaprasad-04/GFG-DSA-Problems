import java.util.HashMap;
class Solution {
    public boolean checkStrings(String s1, String s2) {
        HashMap<Character,Integer>even=new HashMap<>();
        HashMap<Character,Integer>odd=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                even.put(s1.charAt(i),even.getOrDefault(s1.charAt(i),0)+1);
            }
            else odd.put(s1.charAt(i),odd.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            if(i%2==0){
                if(!even.containsKey(s2.charAt(i)))return false;
                even.put(s2.charAt(i),even.get(s2.charAt(i))-1);
                if(even.get(s2.charAt(i))==0)even.remove(s2.charAt(i));
            }
            else {
                if(!odd.containsKey(s2.charAt(i)))return false;
                odd.put(s2.charAt(i),odd.get(s2.charAt(i))-1);
                if(odd.get(s2.charAt(i))==0)odd.remove(s2.charAt(i));
            }
        }
        if(even.size()==0 && odd.size()==0)return true;

        return false;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "abcd";
        String s2 = "cdab";
        boolean result = solution.checkStrings(s1, s2);
        System.out.println(result); // Output: true
    }   
}