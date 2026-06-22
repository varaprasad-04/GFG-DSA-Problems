import java.util.HashMap;
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>s1=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            s1.put(ch,s1.getOrDefault(ch,0)+1);
        }
        String s2="balon";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(ch=='l' || ch=='o')min=Math.min(min,s1.getOrDefault(ch,0)/2);
            else min=Math.min(min,s1.getOrDefault(ch,0));
        }
        return min;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String text = "loonbalxballpoon";
        int result = sol.maxNumberOfBalloons(text);
        System.out.println(result); // Output: 2
    }
}