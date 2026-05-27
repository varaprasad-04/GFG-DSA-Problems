import java.util.*;
class Solution {
    public int numberOfSpecialChars(String word) {
        int lower[]=new int[26];
        int higher[]=new int[26];
        Arrays.fill(lower,-1);
        Arrays.fill(higher,-1);
        int c=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                lower[ch-'a']=i;
            }
            else if(Character.isUpperCase(ch)){
                int ind=ch-'A';
                if(higher[ind]==-1)higher[ind]=i;
            }
        }
        for(int i=0;i<26;i++){
            if(lower[i]!=-1 && higher[i]!=-1 && lower[i]<higher[i])c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        String word="aAAbbbb";
        int result = s.numberOfSpecialChars(word);
        System.out.println(result);
    }
}