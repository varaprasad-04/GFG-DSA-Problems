import java.util.*;
class Solution {
    boolean check(String s1,String s2){
        int n1=s1.length(),n2=s2.length();
        if(n1!=n2)return false;
        //HashMap<Character,Integer>mp=new HashMap<>();
        int c=0;
        for(int i=0;i<n1;i++){
            char ch=s1.charAt(i),ch2=s2.charAt(i);
           if(ch!=ch2)c++;
        }
        if(c>2)return false;

        return true;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res=new ArrayList<>();
        int n1=queries.length,n2=dictionary.length;
        for(int i=0;i<n1;i++){
            String s1=queries[i];
            for(int j=0;j<n2;j++){
                if(check(s1,dictionary[j])){
                    res.add(s1);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        String[] queries={"word","note","ants","wood"};
        String[] dictionary={"wood","note","stone","banana"};
        List<String> result=sol.twoEditWords(queries,dictionary);
        System.out.println(result);
    }
}