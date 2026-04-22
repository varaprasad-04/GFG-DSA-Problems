import java.util.*;
class Solution {
    
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        ArrayList<Integer>res=new ArrayList<>();
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=arr[i]+pre[i-1];
        }
        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            int mean=0;
            if(s>0)mean=pre[e]-pre[s-1];
            else mean=pre[e];
            res.add(mean/(e-s+1));
            
        }
        return res;
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        int[] arr={1,2,3,4,5};
        int[][] queries={{0,2},{1,3},{0,4}};
        ArrayList<Integer> result=sol.findMean(arr, queries);
        System.out.println(result);
    }
}