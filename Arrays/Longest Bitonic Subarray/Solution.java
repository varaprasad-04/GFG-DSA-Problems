class Solution {
    public int bitonic(int[] arr) {
        int n=arr.length;
        int ls[]=new int[n];
        ls[0]=1;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1])ls[i]=ls[i-1]+1;
            else ls[i]=1;
        }
        int gs[]=new int[n];
        gs[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=arr[i+1])gs[i]=gs[i+1]+1;
            else gs[i]=1;
        }
        int c=0;
        for(int i=0;i<n;i++){
            c=Math.max(c,ls[i]+gs[i]-1);
        }
        return c;
    }
}