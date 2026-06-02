class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int land=landStartTime[i]+landDuration[i];
                int minof=Math.max(land,waterStartTime[j]);
                int tot1=minof+waterDuration[j];

                int water=waterStartTime[j]+waterDuration[j];
                int minof2=Math.max(water,landStartTime[i]);
                int tot2=minof2+landDuration[i];

                int ans2=Math.min(tot1,tot2);

                ans=Math.min(ans,ans2);



            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] landStartTime = {1, 2, 3};
        int[] landDuration = {2, 3, 1};
        int[] waterStartTime = {2, 3, 4};
        int[] waterDuration = {3, 1, 2};
        System.out.println(s.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration)); // Output: 5
    }   
}