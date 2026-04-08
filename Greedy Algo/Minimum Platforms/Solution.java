import java.util.Arrays;
class Solution {
    public int minPlatform(int arr[], int dep[]) {
         int mf=1;
         Arrays.sort(arr);
         Arrays.sort(dep);
         int i=0,j=0,plat=0;
         while(i<arr.length && j<dep.length){
             if(arr[i]<=dep[j]){
                 plat++;
                 i++;
             }
             else{
                 plat--;
                 j++;
             }
             mf=Math.max(mf,plat);
         }
         return mf;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int result = solution.minPlatform(arr, dep);
        System.out.println("Minimum number of platforms required: " + result);
    }   
}
