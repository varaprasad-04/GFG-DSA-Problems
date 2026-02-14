import java.util.*;
class Solution {
    public String convertToTitle(int n) {
        StringBuilder s1=new StringBuilder();
        while(n!=0){
            n=n-1;
            int r=n%26;
            s1.append((char)(r+'A'));
            n/=26;
        }
        return s1.reverse().toString();
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int n=701;
        System.out.println(s.convertToTitle(n));
    }
}