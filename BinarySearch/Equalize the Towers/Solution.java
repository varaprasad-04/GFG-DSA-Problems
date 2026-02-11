class Solution {
    static int req(int[] heights,int cost[],int h){
        long total=0;
         for(int i=0;i<heights.length;i++){
            total+=Math.abs(heights[i]-h)*cost[i];
        }
        return (int)total;
    }
    public int minCost(int[] heights, int[] cost) {
       int low=Integer.MAX_VALUE,high=0;
       for(int i:heights){
           low=Math.min(low,i);
           high=Math.max(high,i);
       }
       while(low<high){
           int mid=(low+high)/2;
           int a1=req(heights,cost,mid);
           int a2=req(heights,cost,mid+1);
           if(a1<=a2)high=mid;
           else low=mid+1;
       }
       return req(heights,cost,low);
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] heights={1,3,5,2};
        int[] cost={2,3,1,14};
        System.out.println(s.minCost(heights,cost));
    }
}
