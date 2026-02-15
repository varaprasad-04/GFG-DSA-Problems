// User function Template for Java
import java.util.*;
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        int i=0,j=m-1;
        while( j<arr.size()){
            min=Math.min(min,arr.get(j)-arr.get(i));
            i++;j++;
        }
        return min;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        int m=5;
        System.out.println(s.findMinDiff(arr, m));
    }
}
