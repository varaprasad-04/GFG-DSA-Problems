import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(0);
        int pref[]=new int[arr.length];
        pref[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
            int m=(i+1)/2;
            int med=arr[m];
            int left=(med*m)-(pref[m]-arr[m]);           
           int right=(pref[i]-pref[m])-(med*(i-m));
            ans.add(left+right);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> result = sol.optimalArray(arr);
        System.out.println(result); // Output: [0, 1, 2, 3, 4]
    }
}