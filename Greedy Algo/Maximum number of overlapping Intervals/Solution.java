import java.util.Arrays;
class Solution {
    public static int overlapInt(int[][] arr) {
        int n = arr.length;
        
        
        int[] start = new int[n];
        int[] end = new int[n];
        
        for(int k = 0; k < n; k++){
            start[k] = arr[k][0];
            end[k] = arr[k][1];
        }
        
       
        Arrays.sort(start);
        Arrays.sort(end);
        
        int i = 0, j = 0;
        int c = 0, ans = 0;
        
        while(i < n && j < n){
            if(start[i] <= end[j]){
                c++;
                ans = Math.max(ans, c);
                i++;
            } else {
                c--;
                j++;
            }
        }
        
        return ans;
    }
    public static void main(String args[]){
        int arr[][] = {{1,3}, {2,4}, {3,5}};
        int result = overlapInt(arr);
        System.out.println(result);
    }
}
