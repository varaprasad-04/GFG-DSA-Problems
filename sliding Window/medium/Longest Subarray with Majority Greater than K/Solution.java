    import java.util.HashMap;
    class Solution {
        public int longestSubarray(int[] arr, int k) {
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=k)arr[i]=-1;
                else arr[i]=1;
            }
            HashMap<Integer,Integer>s1=new HashMap<>();
           int sum=0,len=0;
           for(int i=0;i<arr.length;i++){
               sum+=arr[i];
               if(sum>0)len=i+1;
               if(!s1.containsKey(sum))s1.put(sum,i);
               
               if(s1.containsKey(sum-1)){
                   len=Math.max(len,i-s1.get(sum-1));
               }
           }
           return len;
        }
        public static void main(String[] args) {
            Solution sol = new Solution();
            int[] arr = {1, 2, 3, 4, 5};
            int k = 3;
            System.out.println(sol.longestSubarray(arr, k)); // Output: 2
        }
    }