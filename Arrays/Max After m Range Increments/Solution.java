class Solution {
    public int findMax(int n, int[] a, int[] b, int[] k) {
        int pre[]=new int[n];
        for(int i=0;i<a.length;i++){
            int l=a[i],r=b[i];
            pre[l]+=k[i];
            if(r+1<n)pre[r+1]-=k[i];
            
        }
        int max=pre[0],sum=pre[0];
        for(int i=1;i<n;i++){
            sum+=pre[i];
            max=Math.max(sum,max);
        }
        return max;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int n=5;
        int a[]={1,2,3};
        int b[]={2,3,4};
        int k[]={100,100,100};
        System.out.println(s.findMax(n,a,b,k));
    }
}
