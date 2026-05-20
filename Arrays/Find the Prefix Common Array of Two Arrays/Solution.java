import java.util.HashMap;
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer>s1=new HashMap<>();
        int[] ans=new int[A.length];
        int c=0;
        for(int i=0;i<A.length;i++){
            s1.put(A[i],s1.getOrDefault(A[i],0)+1);
            if(s1.get(A[i])==2)c++;
            s1.put(B[i],s1.getOrDefault(B[i],0)+1);
            
            if(s1.get(B[i])==2)c++;
            ans[i]=c;

        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] A={1,3,2,4};
        int[] B={3,1,2,4};
        int[] ans=sol.findThePrefixCommonArray(A,B);
        for(int i:ans)System.out.print(i+" ");
    }
}