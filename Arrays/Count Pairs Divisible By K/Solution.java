class Solution {
    public int countKdivPairs(int[] arr, int k) {
        int freq[]=new int[k];
        int c=0;
        for(int i=0;i<arr.length;i++){
            int rem=arr[i]%k;
            int req=(k-rem)%k;
            if(freq[req]!=0){
                c+=freq[req];
            }
            freq[rem]++;
        }
        return c;
    }
    
}