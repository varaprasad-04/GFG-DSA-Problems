import java.util.Arrays;
class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        int nums[][]=new int[n][2];
        for(int i=0;i<arr.length;i++){
            nums[i][0]=arr[i];
            nums[i][1]=Integer.bitCount(arr[i]);
        }
     Arrays.sort(nums,(a,b)->{
        if(a[1]==b[1])return a[0]-b[0];
        return a[1]-b[1];
        });
     int res[]=new int[n];
     for(int i=0;i<n;i++){
        res[i]=nums[i][0];
     }
      

     return res;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sol.sortByBits(arr))); // Output: [0,1,2,4,8,3,5,6,7]
    }
}