class Solution {
    public int maxOnes(int arr[], int k) {
        int n=arr.length;
        int l=0,r=0,z=0,len=0;
        while(r<n){
            if(arr[r]==0)z++;
            if(z<=k){
                len=Math.max(len,r-l+1);
            }
            if(z>k){
                if(arr[l]==0)z--;
                l++;
            }
            r++;
        }
        return len;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[]={1,0,0,1,1,0,1};
        int k=2;
        int result=s.maxOnes(arr,k);
        System.out.println(result);
    }
}