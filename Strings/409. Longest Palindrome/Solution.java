import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> s1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
        }
        int even=0;
        boolean found=false;
        for(Map.Entry<Character,Integer> e:s1.entrySet()){
            int v=e.getValue();
            if(v%2==0)even+=v;
            else if(v%2!=0){
                even+=v-1;
                found=true;
            }
        }
        if(found)even++;
        return even;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abccccdd";
        int result = solution.longestPalindrome(s);
        System.out.println(result);  // Output: 7
    }
}