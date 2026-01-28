import java.util.Arrays;
class Solution {
    public int findLongestChain(int[][] arr) {
        Arrays.sort(arr,(a,b)-> a[1]-b[1]);
    int count=1,prev=arr[0][1];
    for(int i=1;i<arr.length;i++){
      if(arr[i][0]>prev ){
        count++;
        prev=arr[i][1];
      }
    
    }
    return count;
    }
    public static void main(String args[]){
        Solution s=new Solution();
        int arr[][]={{1,2},{2,3},{3,4}};
        int result=s.findLongestChain(arr);
        System.out.println(result);
    }
}
