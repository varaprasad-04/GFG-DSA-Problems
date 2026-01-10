import java.util.HashMap;
class solution {
    static int cal(String s ,int k){
         HashMap<Character,Integer>s1=new HashMap<>();
       int l=0,n=s.length(),count=0;
       for(int r=0;r<n;r++){
           s1.put(s.charAt(r),s1.getOrDefault(s.charAt(r),0)+1);
           while(s1.size()>k){
               s1.put(s.charAt(l),s1.get(s.charAt(l))-1);
               if(s1.get(s.charAt(l))==0)
                    s1.remove(s.charAt(l));
               l++;
           }
         count+=(r-l+1);
        }
        return count;
    }
    
    public int countSubstr(String s, int k) {
      
       return cal(s,k)-cal(s,k-1);
    }
    public static void main(String[] args) {
        solution sol=new solution();
        String s="pqpqs";
        int k=2;
        System.out.println(sol.countSubstr(s, k));
    }
}