import java.util.*;
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        int t[][]=new int[start.length][2];
        for(int i=0;i<start.length;i++){
            t[i][0]=start[i];
            t[i][1]=end[i];
        }
        Arrays.sort(t,(a,b)->a[1]-b[1]);
        int count=1,i=1,j=0;
        while(i<start.length){
            if(t[i][0]>t[j][1]){
                count++;
                i++;
                j=i-1;
            }
            else i++;
            
        }
        return count;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int result=s.maxMeetings(start,end);
        System.out.println(result);
    }
}
