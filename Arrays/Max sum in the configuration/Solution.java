class Solution {
    static int[] leftrotate(int arr[]){
        int first=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        return arr;
    }
    static int sum(int[] arr,int max,int c){
        if(c==arr.length)return max;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=i*arr[i];
        }
        max=Math.max(max,ans);
        c++;
        arr=leftrotate(arr);
        
        return sum(arr,max,c);
    }
    int maxSum(int[] arr) {
       int max=0,c=0;
       return sum(arr,max,c);
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int arr[]={8,3,1,2};
        System.out.println(s.maxSum(arr));
    }
}