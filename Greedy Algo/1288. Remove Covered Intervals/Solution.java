import java.util.*;
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0])
                return Integer.compare(a[0],b[0]);
            return Integer.compare(b[1],a[1]);
        });
        int c=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=intervals[i-1][0] && intervals[i][1]<=intervals[i-1][1]){
                intervals[i][1]=Math.max(intervals[i-1][1],intervals[i][1]);
                c++;
            }
        }
        
        return intervals.length-c;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] intervals={{1,4},{3,6},{2,8}};
        System.out.println(s.removeCoveredIntervals(intervals));
    }
}