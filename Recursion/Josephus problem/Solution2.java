import java.util.ArrayList;
class Solution2 {
    static int remain(int start,ArrayList<Integer> s1,int k){
        if(s1.size()==1)return s1.get(0);
        
        int r=(start+k-1)%s1.size();
        s1.remove(r);
        
        return remain(r,s1,k);
        
    }
    public int josephus(int n, int k) {
        ArrayList<Integer>s1=new ArrayList<>();
        for(int i=0;i<n;i++){
            s1.add(i+1);
        }
       // s1.remove(k-1);
       return remain(0,s1,k);
    }
    public static void main(String args[]){
        Solution2 s=new Solution2();
        int n=7;
        int k=3;
        int result=s.josephus(n,k);
        System.out.println(result);
    }
}