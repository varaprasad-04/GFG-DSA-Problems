import java.util.*;
class solution {
    static String str;
    static int freq;
    int calcul(String str,int freq){
       this.str=str;
       this.freq=freq;
       return divide(0,str.length()-1);

    }
    int divide(int left,int right){
        int f[]=new int[26];
        for(int i=left;i<=right;i++){
            f[str.charAt(i)-'a']++;

        }
        char split=0;
        for(int i=0;i<26;i++){
            if(f[i]>0 && f[i]<freq){
                split=(char)(i+'a');
                break;
            }
        }
        if(split==0){
            return right-left+1;
        }
        int segment=left;
        int maxlen=0;
        while(segment<=right){
            while(segment<=right && str.charAt(segment)==split){
                segment++;
            }
            if(segment>right)break;
            int current=segment;
            while(current<=right && str.charAt(current)!=split){
                current++;

            } 
            int len=divide(segment,current-1);
            maxlen=Math.max(len,maxlen);
            segment=current;
        }
        return maxlen;
    }
    public int longestSubstring(String s, int k) {
        
        return calcul(s,k);
    }
    public static void main(String args[]){
        solution obj=new solution();
        String s="aaabb";
        int k=3;
        System.out.println(obj.longestSubstring(s,k));
    }
}