import java.util.Arrays;
class Solution {
    static int total(int[] arr,int h){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=(int)Math.ceil((double)arr[i]/h);
        }
        return ans;
    }
    public int kokoEat(int[] arr, int k) {
        Arrays.sort(arr);
       int l=1 ,r=arr[arr.length-1];
       while(l<r){
           int mid=(l+r)/2;
           int ans=total(arr,mid);
           if(ans>k)l=mid+1; 
           else r=mid;
       }
       return l;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] arr={3,6,7,11};
        int k=8;
        System.out.println(s.kokoEat(arr, k));
    }
}
