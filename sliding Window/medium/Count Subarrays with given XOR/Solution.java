import java.util.*;
class Solution {
    public long subarrayXor(int arr[], int k) {
        long count=0;
        HashMap<Integer,Integer>s1=new HashMap<>();
        s1.put(0,1);
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
           
            int pre=xor^k;
            if(s1.containsKey(pre)){
                count+=(int)s1.get(pre);
            }
        
            s1.put(xor,s1.getOrDefault(xor,0)+1);
        }
        return count;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[]={4,2,2,6,4};
        int k=6;
        long result=s.subarrayXor(arr,k);
        System.out.println(result);
    }
}