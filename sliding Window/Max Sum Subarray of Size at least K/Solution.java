class Solution {
    public int maxSumWithK(int[] arr, int k) {
        int pre[]=new int[arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        int minPrefix=0,max=Integer.MIN_VALUE;
          for (int i = k - 1; i < arr.length; i++) {
            // candidate sum of subarray ending at i with length >= k
            max = Math.max(max, pre[i] - minPrefix);

            // update minPrefix for next iteration
            minPrefix = Math.min(minPrefix, pre[i - k + 1]);
        }
        return max;
    }
}