import java.util.*;
class Solution {
    public int equalSumSpan(int[] a1, int[] a2) {
        HashMap<Integer,Integer>s1=new HashMap<>();
        int pre=0,c=0;
        for(int i=0;i<a1.length;i++){
            int diff=a1[i]-a2[i];
            pre+=diff;
            if(pre==0)c=i+1;
            
            if(s1.containsKey(pre)){
                c=Math.max(c,i-s1.get(pre));
            }
            else s1.put(pre,i);
        }
        return c;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a1 = {0, 1, 0, 0, 0};
        int[] a2 = {1, 0, 1, 0, 0};
        int result = solution.equalSumSpan(a1, a2);
        System.out.println("Longest span with equal sum: " + result);
    }
}