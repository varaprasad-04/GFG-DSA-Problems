class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length,k=0;
        int arr[]=new int[n*m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k++]=grid[i][j];
            }
        }
        long pref[]=new long[arr.length];
        pref[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i]=(pref[i-1]*arr[i])%12345;
        }
        int l=arr.length;
        long suf[]=new long[l];
        suf[l-1]=arr[l-1];
        for(int i=l-2;i>=0;i--){
            suf[i]=(suf[i+1]*arr[i])%12345;
        }
        int res[][]=new int[n][m];
        for(int i=0;i<l;i++){
            long left=(i>0)?pref[i-1]:1;
            long right=(i<l-1)?suf[i+1]:1;

            long val=(left*right)%12345;
            res[i/m][i%m]=(int)val;
        }
        return res;
    }
}