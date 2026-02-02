class Solution {
    public int maxCircularSum(int arr[]) {
        int sum=0,maxsum=arr[0],minsum=Integer.MAX_VALUE,prev=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prev=Math.max(arr[i],arr[i]+prev);
            maxsum=Math.max(prev,maxsum);
        }
        if(maxsum<0)return maxsum;
        int pre=0;
       for(int ele:arr){
            
            pre=Math.min(ele,ele+pre);
            minsum=Math.min(pre,minsum);
        }
        return Math.max(maxsum,sum-minsum);
        
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[]={8,-4,3,-5,4};
        int result=s.maxCircularSum(arr);
        System.out.println(result);
    }
}
