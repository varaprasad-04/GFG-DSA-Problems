import java.util.*;
class Solution {
    public int largestArea(int n, int m, int k, int[][] arr) {
        if(k == 0)
         return n * m;
        int row[]=new int[k];
        int col[]=new int[k];
        int r=0,c=0;
        for(int i=0;i<k;i++){
            row[r++]=arr[i][0];
            col[c++]=arr[i][1];
        }
        Arrays.sort(row);
        Arrays.sort(col);
        int rmax = row[0]-1;

        for(int i=1;i<k;i++){
            rmax = Math.max(rmax, row[i]-row[i-1]-1);
        }

        rmax = Math.max(rmax, n-row[k-1]);

        int cmax = col[0]-1;

        for(int i=1;i<k;i++){
            cmax = Math.max(cmax, col[i]-col[i-1]-1);
        }

        cmax = Math.max(cmax, m-col[k-1]);
        return rmax*cmax;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] arr={{1,1},{2,2},{3,3}};
        System.out.println(s.largestArea(5,5,3,arr));
    }
}