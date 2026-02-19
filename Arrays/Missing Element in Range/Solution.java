import java.util.*;
class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
      ArrayList<Integer>res=new ArrayList<>();
     Set<Integer>s1=new HashSet<>();
      for(int ele:arr){
          s1.add(ele);
      }
      for(int i=low;i<=high;i++){
          if(!s1.contains(i))res.add(i);
      }
      return res;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int arr[]={1,3,5,7};
        int low=0,high=10;
        System.out.println(s.missingRange(arr, low, high));
    }
}