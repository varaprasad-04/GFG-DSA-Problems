import java.util.Arrays;
class Solution {
    static boolean canAttend(int[][] arr) {
       Arrays.sort(arr,(a,b)->a[1]-b[1]);
       for(int i=1;i<arr.length;i++){
           if(arr[i][0]<arr[i-1][1])return false;
       }
       return true;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[][]={{0,30},{5,10},{15,20}};
        boolean result=s.canAttend(arr);
        System.out.println(result);
    }
}