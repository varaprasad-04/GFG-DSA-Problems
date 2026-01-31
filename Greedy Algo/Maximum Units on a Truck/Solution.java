import java.util.Arrays;
class Solution {
    public int maximumUnits(int[][] box, int truckSize) {
        Arrays.sort(box,(a,b)->b[1]-a[1]);
        int i=0,ans=0;
        while(truckSize>0){
            int v=Math.min(box[i][0],truckSize);
            ans+=box[i][1]*v;
            truckSize-=v;
            i++;
            if(i>=box.length)return ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] box = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        System.out.println(sol.maximumUnits(box, truckSize)); // Output: 8
    }
}