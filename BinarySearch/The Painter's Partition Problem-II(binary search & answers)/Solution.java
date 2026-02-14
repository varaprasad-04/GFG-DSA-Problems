class Solution {
    static boolean check(int mid,int k,int arr[]){
        int p=1;
        int cur=0;
        for(int ele:arr){
            if(cur+ele<=mid){
                cur+=ele;
            }
            else {
                p++;
                if(p>k)return false;
                
                cur=ele;
            }
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        int max=0,sum=0;
        for(int ele:arr){
            max=Math.max(max,ele);
            sum+=ele;
        }
        int l=max,h=sum;
        while(l<h){
            int mid=(l+h)/2;
            
            if(check(mid,k,arr)){
                h=mid;
            }
            else l=mid+1;
        }
        return h;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int arr[]={10,20,30,40};
        int k=2;
        System.out.println(s.minTime(arr, k));
    }
}
