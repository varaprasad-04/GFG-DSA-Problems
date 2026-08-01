import java.util.*; 
class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        int n=word.length();
        for(int i=0;i<n;i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int c=0,ans=0,t=1;
        for(int i=25;i>=0;i--){
            if(freq[i]==0)break;
            ans+=freq[i]*t;
            c++;
            if(c==8){
                t++;
                c=0;
            }
        }
        
        return ans;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        String word="apple";
        System.out.println(s.minimumPushes(word));
    }
}